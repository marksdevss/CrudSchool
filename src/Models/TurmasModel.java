package Models;

public class TurmasModel {

    private int numeroTurma;

    private String ProfessorResponsavel;

    private String AnoLetivo;

    private String CodigoTurma;

    private String HorariodeAula;

    public TurmasModel() {
    }

    public TurmasModel(int numeroTurma, String ProfessorResponsavel, String AnoLetivo, String CodigoTurma, String HorariodeAula) {
        this.numeroTurma = numeroTurma;
        this.ProfessorResponsavel = ProfessorResponsavel;
        this.AnoLetivo = AnoLetivo;
        this.CodigoTurma = CodigoTurma;
        this.HorariodeAula = HorariodeAula;
    }

    public int getnumeroTurma() {
        return numeroTurma;
    }

    public void setnumeroTurma(int numeroTurma) {
        this.numeroTurma = numeroTurma;
    }

    public String getProfessorResponsavel() {
        return ProfessorResponsavel;
    }

    public void setProfessorResponsavel(String ProfessorResponsavel) {
        this.ProfessorResponsavel = ProfessorResponsavel;
    }

    public String getAnoLetivo() {
        return AnoLetivo;
    }

    public void setAnoLetivo(String AnoLetivo) {
        this.AnoLetivo = AnoLetivo;
    }

    public String getCodigoTurma() {
        return CodigoTurma;
    }

    public void setCodigoTurma(String CodigoTurma) {
        this.CodigoTurma = CodigoTurma;
    }

    public String getHorariodeAula() {
        return HorariodeAula;
    }

    public void setHorariodeAula(String HorariodeAula) {
        this.HorariodeAula = HorariodeAula;
    }

}
