package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class k extends com.tencent.mm.bt.a
{
  public long cSh;
  public int state;
  public String title;
  public String vzL;
  public String vzM;
  public String vzV;
  public int vzW;
  public String vzX;
  public String vzY;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56679);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vzL != null)
        paramArrayOfObject.e(1, this.vzL);
      if (this.title != null)
        paramArrayOfObject.e(2, this.title);
      paramArrayOfObject.ai(3, this.cSh);
      if (this.vzV != null)
        paramArrayOfObject.e(5, this.vzV);
      paramArrayOfObject.iz(10, this.state);
      paramArrayOfObject.iz(11, this.vzW);
      if (this.vzX != null)
        paramArrayOfObject.e(12, this.vzX);
      if (this.vzM != null)
        paramArrayOfObject.e(13, this.vzM);
      if (this.vzY != null)
        paramArrayOfObject.e(14, this.vzY);
      AppMethodBeat.o(56679);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vzL == null)
        break label715;
    label715: for (paramInt = e.a.a.b.b.a.f(1, this.vzL) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.title != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.title);
      i += e.a.a.b.b.a.o(3, this.cSh);
      paramInt = i;
      if (this.vzV != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vzV);
      paramInt = paramInt + e.a.a.b.b.a.bs(10, this.state) + e.a.a.b.b.a.bs(11, this.vzW);
      i = paramInt;
      if (this.vzX != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.vzX);
      paramInt = i;
      if (this.vzM != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.vzM);
      i = paramInt;
      if (this.vzY != null)
        i = paramInt + e.a.a.b.b.a.f(14, this.vzY);
      AppMethodBeat.o(56679);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56679);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        k localk = (k)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        case 4:
        case 6:
        case 7:
        case 8:
        case 9:
        default:
          paramInt = -1;
          AppMethodBeat.o(56679);
          break;
        case 1:
          localk.vzL = locala.BTU.readString();
          AppMethodBeat.o(56679);
          paramInt = i;
          break;
        case 2:
          localk.title = locala.BTU.readString();
          AppMethodBeat.o(56679);
          paramInt = i;
          break;
        case 3:
          localk.cSh = locala.BTU.ve();
          AppMethodBeat.o(56679);
          paramInt = i;
          break;
        case 5:
          localk.vzV = locala.BTU.readString();
          AppMethodBeat.o(56679);
          paramInt = i;
          break;
        case 10:
          localk.state = locala.BTU.vd();
          AppMethodBeat.o(56679);
          paramInt = i;
          break;
        case 11:
          localk.vzW = locala.BTU.vd();
          AppMethodBeat.o(56679);
          paramInt = i;
          break;
        case 12:
          localk.vzX = locala.BTU.readString();
          AppMethodBeat.o(56679);
          paramInt = i;
          break;
        case 13:
          localk.vzM = locala.BTU.readString();
          AppMethodBeat.o(56679);
          paramInt = i;
          break;
        case 14:
          localk.vzY = locala.BTU.readString();
          AppMethodBeat.o(56679);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56679);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.k
 * JD-Core Version:    0.6.2
 */