import "../styles/student.css";

function StudentResult() {
  const student = {
    name: "Suma Harshitha Yarramsetty",
    college: "PVPSIT",
    totalMarks: 472,
    subjects: 5,
  };

  const average = (student.totalMarks / student.subjects).toFixed(2);

  return (
    <div className="card">
      <h2>Student Performance Report</h2>

      <p>
        <b>Name :</b> {student.name}
      </p>
      <p>
        <b>College :</b> {student.college}
      </p>
      <p>
        <b>Total Marks :</b> {student.totalMarks}
      </p>
      <p>
        <b>Average :</b> {average}
      </p>
    </div>
  );
}

export default StudentResult;
