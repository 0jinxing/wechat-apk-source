package com.tencent.mm.u;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cm;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/engine/FunctionMsgEngine$FunctionMsg;", "", "addMsg", "Lcom/tencent/mm/protocal/protobuf/AddMsg;", "values", "", "", "(Lcom/tencent/mm/protocal/protobuf/AddMsg;Ljava/util/Map;)V", "getAddMsg", "()Lcom/tencent/mm/protocal/protobuf/AddMsg;", "getValues", "()Ljava/util/Map;", "plugin-functionmsg_release"})
final class a$a
{
  final cm eAB;
  final Map<String, String> values;

  public a$a(cm paramcm, Map<String, String> paramMap)
  {
    AppMethodBeat.i(35458);
    this.eAB = paramcm;
    this.values = paramMap;
    AppMethodBeat.o(35458);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.u.a.a
 * JD-Core Version:    0.6.2
 */