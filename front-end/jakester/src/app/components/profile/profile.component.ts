import { Component, OnInit } from '@angular/core';
import { UserServiceService } from '../services/user-service.service';
import {Cloudinary, CloudinaryImage} from '@cloudinary/url-gen';

declare var cloudinary: any;

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.scss']
})
export class ProfileComponent implements OnInit {


  constructor(private userSrv:UserServiceService) {

    this.widget = cloudinary.createUploadWidget(
      {
        cloudName: 'dgl7cqvsv',
        uploadPreset: 'jakester',
      },
      (error: any, result: any) => {
        if (!error && result && result.event === 'success') {
          console.log('Done! Here is the image info: ', result.info);
          this.previewImgSrc = result.info.secure_url;
          console.log(this.previewImgSrc);
          this.user.profile_pic=this.previewImgSrc;
          this.userSrv.saveUser(this.user).subscribe((data:any)=>{
            console.log(data);
            setTimeout(()=>{
              window.location.reload();
            },1000);
          });
        }
      }
    );


  }


  profile=window.location.href.split("/").pop();
  profileId=Number(this.profile);

  user:any;

  previewImgSrc!:string;

  widget: any;


  ngOnInit(): void {
    this.userSrv.getUserById(this.profileId).subscribe((data:any)=>{
      console.log(data);
      this.user=data;
      console.log(this.user);
    });


  }

  showWidget() {
    this.widget.open();
  }

}
