package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class bbb extends com.tencent.mm.bt.a
{
  public String ThumbUrl;
  public String Title;
  public int wFQ;
  public int wFR;
  public int wkB;
  public String wkC;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(54952);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Title");
        AppMethodBeat.o(54952);
        throw paramArrayOfObject;
      }
      if (this.ThumbUrl == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ThumbUrl");
        AppMethodBeat.o(54952);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.wFQ);
      if (this.Title != null)
        paramArrayOfObject.e(2, this.Title);
      if (this.ThumbUrl != null)
        paramArrayOfObject.e(3, this.ThumbUrl);
      paramArrayOfObject.iz(4, this.wkB);
      if (this.wkC != null)
        paramArrayOfObject.e(5, this.wkC);
      paramArrayOfObject.iz(6, this.wFR);
      AppMethodBeat.o(54952);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.wFQ) + 0;
        paramInt = i;
        if (this.Title != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.Title);
        i = paramInt;
        if (this.ThumbUrl != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.ThumbUrl);
        i += e.a.a.b.b.a.bs(4, this.wkB);
        paramInt = i;
        if (this.wkC != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.wkC);
        paramInt += e.a.a.b.b.a.bs(6, this.wFR);
        AppMethodBeat.o(54952);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.Title == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Title");
          AppMethodBeat.o(54952);
          throw paramArrayOfObject;
        }
        if (this.ThumbUrl == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ThumbUrl");
          AppMethodBeat.o(54952);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(54952);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bbb localbbb = (bbb)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(54952);
          break;
        case 1:
          localbbb.wFQ = locala.BTU.vd();
          AppMethodBeat.o(54952);
          paramInt = 0;
          break;
        case 2:
          localbbb.Title = locala.BTU.readString();
          AppMethodBeat.o(54952);
          paramInt = 0;
          break;
        case 3:
          localbbb.ThumbUrl = locala.BTU.readString();
          AppMethodBeat.o(54952);
          paramInt = 0;
          break;
        case 4:
          localbbb.wkB = locala.BTU.vd();
          AppMethodBeat.o(54952);
          paramInt = 0;
          break;
        case 5:
          localbbb.wkC = locala.BTU.readString();
          AppMethodBeat.o(54952);
          paramInt = 0;
          break;
        case 6:
          localbbb.wFR = locala.BTU.vd();
          AppMethodBeat.o(54952);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(54952);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bbb
 * JD-Core Version:    0.6.2
 */