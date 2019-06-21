package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.j.a.a.a;
import com.tencent.mm.protocal.protobuf.qe;
import java.util.ArrayList;
import java.util.List;

public final class o
  implements com.tencent.mm.plugin.chatroom.a.b
{
  public final boolean N(String paramString, int paramInt)
  {
    AppMethodBeat.i(5551);
    boolean bool = n.N(paramString, paramInt);
    AppMethodBeat.o(5551);
    return bool;
  }

  public final String U(List<String> paramList)
  {
    AppMethodBeat.i(5550);
    paramList = n.f(paramList, -1);
    AppMethodBeat.o(5550);
    return paramList;
  }

  public final boolean a(String paramString1, String paramString2, qe paramqe, String paramString3, a parama, com.tencent.mm.sdk.b.b paramb)
  {
    AppMethodBeat.i(5552);
    boolean bool = n.a(paramString1, paramString2, paramqe, 0, paramString3, parama, paramb);
    AppMethodBeat.o(5552);
    return bool;
  }

  public final boolean a(String paramString1, ArrayList<String> paramArrayList, String paramString2)
  {
    AppMethodBeat.i(5549);
    boolean bool = n.a(paramString1, paramArrayList, paramString2);
    AppMethodBeat.o(5549);
    return bool;
  }

  public final int mA(String paramString)
  {
    AppMethodBeat.i(5548);
    int i = n.mA(paramString);
    AppMethodBeat.o(5548);
    return i;
  }

  public final List<String> my(String paramString)
  {
    AppMethodBeat.i(5547);
    paramString = n.my(paramString);
    AppMethodBeat.o(5547);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.o
 * JD-Core Version:    0.6.2
 */