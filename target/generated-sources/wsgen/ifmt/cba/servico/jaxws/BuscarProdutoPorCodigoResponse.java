
package ifmt.cba.servico.jaxws;

import ifmt.cba.vo.ProdutoVO;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name = "buscarProdutoPorCodigoResponse", namespace = "http://servico.cba.ifmt/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscarProdutoPorCodigoResponse", namespace = "http://servico.cba.ifmt/")
public class BuscarProdutoPorCodigoResponse {

    @XmlElement(name = "return", namespace = "")
    private ProdutoVO _return;

    /**
     * 
     * @return
     *     returns ProdutoVO
     */
    public ProdutoVO getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(ProdutoVO _return) {
        this._return = _return;
    }

}
