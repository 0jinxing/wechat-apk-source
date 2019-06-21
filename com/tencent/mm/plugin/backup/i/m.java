package com.tencent.mm.plugin.backup.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class m extends com.tencent.mm.bt.a
{
  public String jBE;
  public String jBF;
  public String jBG;
  public String jBH;
  public String jBI;
  public int jBJ;
  public long jBK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(18060);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jBE == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: DeviceID");
        AppMethodBeat.o(18060);
        throw paramArrayOfObject;
      }
      if (this.jBF == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: DeviceName");
        AppMethodBeat.o(18060);
        throw paramArrayOfObject;
      }
      if (this.jBG == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Model");
        AppMethodBeat.o(18060);
        throw paramArrayOfObject;
      }
      if (this.jBH == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SystemName");
        AppMethodBeat.o(18060);
        throw paramArrayOfObject;
      }
      if (this.jBI == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SystemVersion");
        AppMethodBeat.o(18060);
        throw paramArrayOfObject;
      }
      if (this.jBE != null)
        paramArrayOfObject.e(1, this.jBE);
      if (this.jBF != null)
        paramArrayOfObject.e(2, this.jBF);
      if (this.jBG != null)
        paramArrayOfObject.e(3, this.jBG);
      if (this.jBH != null)
        paramArrayOfObject.e(4, this.jBH);
      if (this.jBI != null)
        paramArrayOfObject.e(5, this.jBI);
      paramArrayOfObject.iz(6, this.jBJ);
      paramArrayOfObject.ai(7, this.jBK);
      AppMethodBeat.o(18060);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jBE == null)
        break label838;
    label838: for (i = e.a.a.b.b.a.f(1, this.jBE) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.jBF != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.jBF);
      i = paramInt;
      if (this.jBG != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.jBG);
      paramInt = i;
      if (this.jBH != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.jBH);
      i = paramInt;
      if (this.jBI != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.jBI);
      paramInt = i + e.a.a.b.b.a.bs(6, this.jBJ) + e.a.a.b.b.a.o(7, this.jBK);
      AppMethodBeat.o(18060);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.jBE == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: DeviceID");
          AppMethodBeat.o(18060);
          throw paramArrayOfObject;
        }
        if (this.jBF == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: DeviceName");
          AppMethodBeat.o(18060);
          throw paramArrayOfObject;
        }
        if (this.jBG == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Model");
          AppMethodBeat.o(18060);
          throw paramArrayOfObject;
        }
        if (this.jBH == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SystemName");
          AppMethodBeat.o(18060);
          throw paramArrayOfObject;
        }
        if (this.jBI == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SystemVersion");
          AppMethodBeat.o(18060);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(18060);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        m localm = (m)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(18060);
          break;
        case 1:
          localm.jBE = locala.BTU.readString();
          AppMethodBeat.o(18060);
          paramInt = i;
          break;
        case 2:
          localm.jBF = locala.BTU.readString();
          AppMethodBeat.o(18060);
          paramInt = i;
          break;
        case 3:
          localm.jBG = locala.BTU.readString();
          AppMethodBeat.o(18060);
          paramInt = i;
          break;
        case 4:
          localm.jBH = locala.BTU.readString();
          AppMethodBeat.o(18060);
          paramInt = i;
          break;
        case 5:
          localm.jBI = locala.BTU.readString();
          AppMethodBeat.o(18060);
          paramInt = i;
          break;
        case 6:
          localm.jBJ = locala.BTU.vd();
          AppMethodBeat.o(18060);
          paramInt = i;
          break;
        case 7:
          localm.jBK = locala.BTU.ve();
          AppMethodBeat.o(18060);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(18060);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.i.m
 * JD-Core Version:    0.6.2
 */