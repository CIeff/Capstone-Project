import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'autoplay'
})
export class AutoplayPipe implements PipeTransform {

  transform(value: string): string {
    if (value) {
      return value + '?rel=0&autoplay=0&controls=0&showinfo=0&enablejsapi=1&origin=http://localhost:4200';
    } else {
      return '';
    }
  }

}
