package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cfh extends com.tencent.mm.bt.a
{
  public String fiG;
  public String fiI;
  public String fiJ;
  public String fiK;
  public String fiL;
  public String fiM;
  public String fiN;
  public int wid;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51006);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.fiG != null)
        paramArrayOfObject.e(1, this.fiG);
      paramArrayOfObject.iz(2, this.wid);
      if (this.fiJ != null)
        paramArrayOfObject.e(3, this.fiJ);
      if (this.fiK != null)
        paramArrayOfObject.e(4, this.fiK);
      if (this.fiI != null)
        paramArrayOfObject.e(5, this.fiI);
      if (this.fiL != null)
        paramArrayOfObject.e(6, this.fiL);
      if (this.fiM != null)
        paramArrayOfObject.e(7, this.fiM);
      if (this.fiN != null)
        paramArrayOfObject.e(8, this.fiN);
      AppMethodBeat.o(51006);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.fiG == null)
        break label660;
    label660: for (paramInt = e.a.a.b.b.a.f(1, this.fiG) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.wid);
      i = paramInt;
      if (this.fiJ != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.fiJ);
      paramInt = i;
      if (this.fiK != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.fiK);
      i = paramInt;
      if (this.fiI != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.fiI);
      paramInt = i;
      if (this.fiL != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.fiL);
      i = paramInt;
      if (this.fiM != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.fiM);
      paramInt = i;
      if (this.fiN != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.fiN);
      AppMethodBeat.o(51006);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51006);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cfh localcfh = (cfh)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51006);
          break;
        case 1:
          localcfh.fiG = locala.BTU.readString();
          AppMethodBeat.o(51006);
          paramInt = i;
          break;
        case 2:
          localcfh.wid = locala.BTU.vd();
          AppMethodBeat.o(51006);
          paramInt = i;
          break;
        case 3:
          localcfh.fiJ = locala.BTU.readString();
          AppMethodBeat.o(51006);
          paramInt = i;
          break;
        case 4:
          localcfh.fiK = locala.BTU.readString();
          AppMethodBeat.o(51006);
          paramInt = i;
          break;
        case 5:
          localcfh.fiI = locala.BTU.readString();
          AppMethodBeat.o(51006);
          paramInt = i;
          break;
        case 6:
          localcfh.fiL = locala.BTU.readString();
          AppMethodBeat.o(51006);
          paramInt = i;
          break;
        case 7:
          localcfh.fiM = locala.BTU.readString();
          AppMethodBeat.o(51006);
          paramInt = i;
          break;
        case 8:
          localcfh.fiN = locala.BTU.readString();
          AppMethodBeat.o(51006);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51006);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cfh
 * JD-Core Version:    0.6.2
 */