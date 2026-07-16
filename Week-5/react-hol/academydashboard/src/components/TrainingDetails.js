import styles from "../styles/TrainingDetails.module.css";

function TrainingDetails() {
  const trainings = [
    {
      id: 1,
      title: "React Fundamentals",
      trainer: "Meghana",
      duration: "4 Weeks",
      status: "Ongoing",
    },

    {
      id: 2,
      title: "Spring Boot",
      trainer: "David",
      duration: "6 Weeks",
      status: "Completed",
    },

    {
      id: 3,
      title: "Microservices",
      trainer: "Haritha",
      duration: "5 Weeks",
      status: "Ongoing",
    },
  ];

  return (
    <div>
      <h1>Training Dashboard</h1>

      {trainings.map((training) => (
        <div key={training.id} className={styles.card}>
          <h3
            className={
              training.status === "Ongoing" ? styles.ongoing : styles.completed
            }
          >
            {training.title}
          </h3>

          <dl>
            <dt>Trainer</dt>
            <dd>{training.trainer}</dd>

            <dt>Duration</dt>
            <dd>{training.duration}</dd>

            <dt>Status</dt>
            <dd>{training.status}</dd>
          </dl>
        </div>
      ))}
    </div>
  );
}

export default TrainingDetails;
