package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class op extends com.tencent.mm.bt.a
{
  public String kKZ;
  public String kbW;
  public String kfM;
  public String title;
  public String url;
  public String vTL;
  public String vTM;
  public long vUW;
  public String vUX;
  public String vUY;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89047);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      if (this.kbW != null)
        paramArrayOfObject.e(2, this.kbW);
      if (this.kfM != null)
        paramArrayOfObject.e(3, this.kfM);
      if (this.url != null)
        paramArrayOfObject.e(4, this.url);
      paramArrayOfObject.ai(5, this.vUW);
      if (this.vUX != null)
        paramArrayOfObject.e(6, this.vUX);
      if (this.vUY != null)
        paramArrayOfObject.e(7, this.vUY);
      if (this.kKZ != null)
        paramArrayOfObject.e(8, this.kKZ);
      if (this.vTL != null)
        paramArrayOfObject.e(9, this.vTL);
      if (this.vTM != null)
        paramArrayOfObject.e(10, this.vTM);
      AppMethodBeat.o(89047);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label790;
    label790: for (paramInt = e.a.a.b.b.a.f(1, this.title) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.kbW != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.kbW);
      paramInt = i;
      if (this.kfM != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kfM);
      i = paramInt;
      if (this.url != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.url);
      i += e.a.a.b.b.a.o(5, this.vUW);
      paramInt = i;
      if (this.vUX != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vUX);
      i = paramInt;
      if (this.vUY != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.vUY);
      paramInt = i;
      if (this.kKZ != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.kKZ);
      i = paramInt;
      if (this.vTL != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.vTL);
      paramInt = i;
      if (this.vTM != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.vTM);
      AppMethodBeat.o(89047);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89047);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        op localop = (op)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89047);
          break;
        case 1:
          localop.title = locala.BTU.readString();
          AppMethodBeat.o(89047);
          paramInt = i;
          break;
        case 2:
          localop.kbW = locala.BTU.readString();
          AppMethodBeat.o(89047);
          paramInt = i;
          break;
        case 3:
          localop.kfM = locala.BTU.readString();
          AppMethodBeat.o(89047);
          paramInt = i;
          break;
        case 4:
          localop.url = locala.BTU.readString();
          AppMethodBeat.o(89047);
          paramInt = i;
          break;
        case 5:
          localop.vUW = locala.BTU.ve();
          AppMethodBeat.o(89047);
          paramInt = i;
          break;
        case 6:
          localop.vUX = locala.BTU.readString();
          AppMethodBeat.o(89047);
          paramInt = i;
          break;
        case 7:
          localop.vUY = locala.BTU.readString();
          AppMethodBeat.o(89047);
          paramInt = i;
          break;
        case 8:
          localop.kKZ = locala.BTU.readString();
          AppMethodBeat.o(89047);
          paramInt = i;
          break;
        case 9:
          localop.vTL = locala.BTU.readString();
          AppMethodBeat.o(89047);
          paramInt = i;
          break;
        case 10:
          localop.vTM = locala.BTU.readString();
          AppMethodBeat.o(89047);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89047);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.op
 * JD-Core Version:    0.6.2
 */