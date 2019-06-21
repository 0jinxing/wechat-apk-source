package com.tencent.mm.plugin.backup.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class aa extends com.tencent.mm.bt.a
{
  public String jBt;
  public long jCE;
  public long jCF;
  public String jCG;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(18076);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jBt == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BakChatName");
        AppMethodBeat.o(18076);
        throw paramArrayOfObject;
      }
      if (this.jCG == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: MsgDataID");
        AppMethodBeat.o(18076);
        throw paramArrayOfObject;
      }
      if (this.jBt != null)
        paramArrayOfObject.e(1, this.jBt);
      paramArrayOfObject.ai(2, this.jCE);
      paramArrayOfObject.ai(3, this.jCF);
      if (this.jCG != null)
        paramArrayOfObject.e(4, this.jCG);
      AppMethodBeat.o(18076);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jBt == null)
        break label494;
    label494: for (paramInt = e.a.a.b.b.a.f(1, this.jBt) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.jCE) + e.a.a.b.b.a.o(3, this.jCF);
      paramInt = i;
      if (this.jCG != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.jCG);
      AppMethodBeat.o(18076);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.jBt == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BakChatName");
          AppMethodBeat.o(18076);
          throw paramArrayOfObject;
        }
        if (this.jCG == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: MsgDataID");
          AppMethodBeat.o(18076);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(18076);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aa localaa = (aa)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(18076);
          break;
        case 1:
          localaa.jBt = locala.BTU.readString();
          AppMethodBeat.o(18076);
          paramInt = i;
          break;
        case 2:
          localaa.jCE = locala.BTU.ve();
          AppMethodBeat.o(18076);
          paramInt = i;
          break;
        case 3:
          localaa.jCF = locala.BTU.ve();
          AppMethodBeat.o(18076);
          paramInt = i;
          break;
        case 4:
          localaa.jCG = locala.BTU.readString();
          AppMethodBeat.o(18076);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(18076);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.i.aa
 * JD-Core Version:    0.6.2
 */