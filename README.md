Candidate Management System
This project implements a Candidate Management System in Java. The system allows for the management and evaluation of candidates for a certain position or role.

The main class in this project is Candidato, which represents a candidate. Each candidate has an id, a nome (name), and a status. The status represents the current stage of evaluation for the candidate and can have three possible values: "recebido" (received), "qualificado" (qualified), or "aprovado" (approved).

The Candidato class provides the following functionalities:

Initialization: The constructor takes an id and a nome as parameters and sets the initial status of the candidate to "recebido" (received).
Accessors: Methods such as getId(), getNome(), and getStatus() are provided to retrieve the candidate's information.
Interview Scheduling: The method marcarEntrevista() allows marking an interview for a candidate. If the candidate's current status is "recebido" (received), it is updated to "qualificado" (qualified). Otherwise, an IllegalStateException is thrown.
Candidate Approval: The method aprovarCandidato() is used to approve a candidate. If the candidate's current status is "qualificado" (qualified), it is updated to "aprovado" (approved). Otherwise, an IllegalStateException is thrown.
Approval Check: The method isAprovado() checks whether the candidate has been approved or not.
This project provides a foundation for managing candidates and their evaluation process. It can be further extended and integrated into a larger recruitment or hiring system.
