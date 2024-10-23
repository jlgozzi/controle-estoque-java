
package ifmt.cba.servico.jaxws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "buscarProdutoPorCodigo", namespace = "http://servico.cba.ifmt/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscarProdutoPorCodigo", namespace = "http://servico.cba.ifmt/")
public class BuscarProdutoPorCodigo {

    @XmlElement(name = "arg0", namespace = "")
    private int arg0;

    /**
     * 
     * @return
     *     returns int
     */
    public int getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(int arg0) {
        this.arg0 = arg0;
    }

}
