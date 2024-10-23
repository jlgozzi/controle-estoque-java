
package ifmt.cba.servico.jaxws;

import ifmt.cba.vo.ProdutoVO;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "baixarEstoqueProduto", namespace = "http://servico.cba.ifmt/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baixarEstoqueProduto", namespace = "http://servico.cba.ifmt/", propOrder = {
    "arg0",
    "arg1"
})
public class BaixarEstoqueProduto {

    @XmlElement(name = "arg0", namespace = "")
    private ProdutoVO arg0;
    @XmlElement(name = "arg1", namespace = "")
    private int arg1;

    /**
     * 
     * @return
     *     returns ProdutoVO
     */
    public ProdutoVO getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(ProdutoVO arg0) {
        this.arg0 = arg0;
    }

    /**
     * 
     * @return
     *     returns int
     */
    public int getArg1() {
        return this.arg1;
    }

    /**
     * 
     * @param arg1
     *     the value for the arg1 property
     */
    public void setArg1(int arg1) {
        this.arg1 = arg1;
    }

}
