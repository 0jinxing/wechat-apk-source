package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class acy extends com.tencent.mm.bt.a
{
  public String mZr;
  public String vEA;
  public int wkB;
  public String wkC;
  public String wkK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(112425);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZr == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AppID");
        AppMethodBeat.o(112425);
        throw paramArrayOfObject;
      }
      if (this.wkK == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: RecommendKey");
        AppMethodBeat.o(112425);
        throw paramArrayOfObject;
      }
      if (this.mZr != null)
        paramArrayOfObject.e(1, this.mZr);
      if (this.wkK != null)
        paramArrayOfObject.e(2, this.wkK);
      if (this.vEA != null)
        paramArrayOfObject.e(3, this.vEA);
      paramArrayOfObject.iz(4, this.wkB);
      if (this.wkC != null)
        paramArrayOfObject.e(5, this.wkC);
      AppMethodBeat.o(112425);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZr == null)
        break label559;
    label559: for (i = e.a.a.b.b.a.f(1, this.mZr) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wkK != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wkK);
      i = paramInt;
      if (this.vEA != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vEA);
      i += e.a.a.b.b.a.bs(4, this.wkB);
      paramInt = i;
      if (this.wkC != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wkC);
      AppMethodBeat.o(112425);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.mZr == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AppID");
          AppMethodBeat.o(112425);
          throw paramArrayOfObject;
        }
        if (this.wkK == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: RecommendKey");
          AppMethodBeat.o(112425);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(112425);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        acy localacy = (acy)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(112425);
          break;
        case 1:
          localacy.mZr = locala.BTU.readString();
          AppMethodBeat.o(112425);
          paramInt = i;
          break;
        case 2:
          localacy.wkK = locala.BTU.readString();
          AppMethodBeat.o(112425);
          paramInt = i;
          break;
        case 3:
          localacy.vEA = locala.BTU.readString();
          AppMethodBeat.o(112425);
          paramInt = i;
          break;
        case 4:
          localacy.wkB = locala.BTU.vd();
          AppMethodBeat.o(112425);
          paramInt = i;
          break;
        case 5:
          localacy.wkC = locala.BTU.readString();
          AppMethodBeat.o(112425);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(112425);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.acy
 * JD-Core Version:    0.6.2
 */