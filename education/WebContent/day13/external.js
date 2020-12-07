function Student(name1, kor, eng, math, science) {
	var name = name1;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
	this.science = science;
	this.getName = function() {
		return name + "님";
	};
}

Student.prototype.getSum = function() {
	return (this.kor + this.eng + this.math + this.science);
};
Student.prototype.getAve = function() {
	return this.getSum() / 4;
};
Student.prototype.toString = function() {
	return this.getName()+" --> "
		+JSON.stringify(this)+" / 평균 : "+this.getAve()+"<br>";
};