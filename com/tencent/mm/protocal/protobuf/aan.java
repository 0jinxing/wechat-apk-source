package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aan extends com.tencent.mm.bt.a
{
  public String SmallImgUrl;
  public String jBB;
  public int jBT;
  public String jCH;
  public String wfK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28406);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jBB != null)
        paramArrayOfObject.e(1, this.jBB);
      if (this.wfK != null)
        paramArrayOfObject.e(2, this.wfK);
      if (this.jCH != null)
        paramArrayOfObject.e(3, this.jCH);
      if (this.SmallImgUrl != null)
        paramArrayOfObject.e(4, this.SmallImgUrl);
      paramArrayOfObject.iz(5, this.jBT);
      AppMethodBeat.o(28406);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jBB == null)
        break label474;
    label474: for (i = e.a.a.b.b.a.f(1, this.jBB) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wfK != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wfK);
      i = paramInt;
      if (this.jCH != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.jCH);
      paramInt = i;
      if (this.SmallImgUrl != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.SmallImgUrl);
      paramInt += e.a.a.b.b.a.bs(5, this.jBT);
      AppMethodBeat.o(28406);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28406);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aan localaan = (aan)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28406);
          break;
        case 1:
          localaan.jBB = locala.BTU.readString();
          AppMethodBeat.o(28406);
          paramInt = i;
          break;
        case 2:
          localaan.wfK = locala.BTU.readString();
          AppMethodBeat.o(28406);
          paramInt = i;
          break;
        case 3:
          localaan.jCH = locala.BTU.readString();
          AppMethodBeat.o(28406);
          paramInt = i;
          break;
        case 4:
          localaan.SmallImgUrl = locala.BTU.readString();
          AppMethodBeat.o(28406);
          paramInt = i;
          break;
        case 5:
          localaan.jBT = locala.BTU.vd();
          AppMethodBeat.o(28406);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28406);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aan
 * JD-Core Version:    0.6.2
 */