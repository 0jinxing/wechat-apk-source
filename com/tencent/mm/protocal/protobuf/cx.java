package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cx extends com.tencent.mm.bt.a
{
  public String guO;
  public String guP;
  public String guW;
  public String jBB;
  public String naq;
  public String vEV;
  public String vEW;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56701);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.guW != null)
        paramArrayOfObject.e(1, this.guW);
      if (this.guO != null)
        paramArrayOfObject.e(2, this.guO);
      if (this.guP != null)
        paramArrayOfObject.e(3, this.guP);
      if (this.naq != null)
        paramArrayOfObject.e(4, this.naq);
      if (this.jBB != null)
        paramArrayOfObject.e(5, this.jBB);
      if (this.vEV != null)
        paramArrayOfObject.e(6, this.vEV);
      if (this.vEW != null)
        paramArrayOfObject.e(7, this.vEW);
      AppMethodBeat.o(56701);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.guW == null)
        break label613;
    label613: for (i = e.a.a.b.b.a.f(1, this.guW) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.guO != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.guO);
      i = paramInt;
      if (this.guP != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.guP);
      paramInt = i;
      if (this.naq != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.naq);
      i = paramInt;
      if (this.jBB != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.jBB);
      paramInt = i;
      if (this.vEV != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vEV);
      i = paramInt;
      if (this.vEW != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.vEW);
      AppMethodBeat.o(56701);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56701);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cx localcx = (cx)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56701);
          break;
        case 1:
          localcx.guW = locala.BTU.readString();
          AppMethodBeat.o(56701);
          paramInt = i;
          break;
        case 2:
          localcx.guO = locala.BTU.readString();
          AppMethodBeat.o(56701);
          paramInt = i;
          break;
        case 3:
          localcx.guP = locala.BTU.readString();
          AppMethodBeat.o(56701);
          paramInt = i;
          break;
        case 4:
          localcx.naq = locala.BTU.readString();
          AppMethodBeat.o(56701);
          paramInt = i;
          break;
        case 5:
          localcx.jBB = locala.BTU.readString();
          AppMethodBeat.o(56701);
          paramInt = i;
          break;
        case 6:
          localcx.vEV = locala.BTU.readString();
          AppMethodBeat.o(56701);
          paramInt = i;
          break;
        case 7:
          localcx.vEW = locala.BTU.readString();
          AppMethodBeat.o(56701);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56701);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cx
 * JD-Core Version:    0.6.2
 */