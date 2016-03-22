package ro.cosminene.employeeprofile.domain

case class EmployeeProfile(id: String, name: Name, contact: Contact, position: Position) extends RootEntity with Aggregate
