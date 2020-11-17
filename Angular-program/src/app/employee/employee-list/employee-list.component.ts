import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  selectedEmployeeCountRadioButton: string = 'All';
  employees: any[];
 

getEmployees(): void {
  this.employees = [
      {
          code: 'emp101', name: 'Tom', gender: 'Male',
          annualSalary: 5500, dateOfBirth: '11/6/1988'
      },
      {
          code: 'emp102', name: 'Alex', gender: 'Male',
          annualSalary: 5700.95, dateOfBirth: '9/6/1982'
      },
      {
          code: 'emp103', name: 'Mike', gender: 'Male',
          annualSalary: 5900, dateOfBirth: '12/8/1979'
      },
      {
          code: 'emp104', name: 'Mary', gender: 'Female',
          annualSalary: 6500.826, dateOfBirth: '11/10/1980'
      },
      {
          code: 'emp105', name: 'Nancy', gender: 'Female',
          annualSalary: 6700.826, dateOfBirth: '10/12/1982'
      },
  ];
}

getTotalEmployeesCount(): number {
  return this.employees.length;
}

getMaleEmployeesCount(): number {
  return this.employees.filter(e => e.gender === 'Male').length;
}

getFemaleEmployeesCount(): number {
  return this.employees.filter(e => e.gender === 'Female').length;
}
trackByEmpCode(index: number, employee: any): string {
  return employee.code;
}
  constructor() { 

    this.employees= [
      {
          code: 'emp101', name: 'Tom', gender: 'Male',
          annualSalary: 5500, dateOfBirth: '11/6/1988'
      },
      {
          code: 'emp102', name: 'Alex', gender: 'Male',
          annualSalary: 5700.95, dateOfBirth: '9/6/1982'
      },
      {
          code: 'emp103', name: 'Mike', gender: 'Male',
          annualSalary: 5900, dateOfBirth: '12/8/1979'
      },
     
  ];
  

  }

  ngOnInit(): void {
  }

  onEmployeeCountRadioButtonChange(selectedRadioButtonValue: string): void {
    alert("Emmiter Value="+selectedRadioButtonValue)
    this.selectedEmployeeCountRadioButton = selectedRadioButtonValue;
}

}
