package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class alm extends com.tencent.mm.bt.a
{
  public String aOt;
  public String app_id;
  public LinkedList<String> wqM;

  public alm()
  {
    AppMethodBeat.i(80085);
    this.wqM = new LinkedList();
    AppMethodBeat.o(80085);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80086);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.aOt != null)
        paramArrayOfObject.e(1, this.aOt);
      if (this.app_id != null)
        paramArrayOfObject.e(2, this.app_id);
      paramArrayOfObject.e(3, 1, this.wqM);
      AppMethodBeat.o(80086);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.aOt == null)
        break label353;
    label353: for (paramInt = e.a.a.b.b.a.f(1, this.aOt) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.app_id != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.app_id);
      paramInt = i + e.a.a.a.c(3, 1, this.wqM);
      AppMethodBeat.o(80086);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wqM.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80086);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        alm localalm = (alm)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80086);
          break;
        case 1:
          localalm.aOt = locala.BTU.readString();
          AppMethodBeat.o(80086);
          paramInt = i;
          break;
        case 2:
          localalm.app_id = locala.BTU.readString();
          AppMethodBeat.o(80086);
          paramInt = i;
          break;
        case 3:
          localalm.wqM.add(locala.BTU.readString());
          AppMethodBeat.o(80086);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80086);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.alm
 * JD-Core Version:    0.6.2
 */