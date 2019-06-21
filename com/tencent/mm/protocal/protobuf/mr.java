package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class mr extends com.tencent.mm.bt.a
{
  public String cIY;
  public String tID;
  public String title;
  public int type;
  public String tzT;
  public String url;
  public String vQG;
  public String vQH;
  public int vQI;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56733);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.type);
      if (this.tID != null)
        paramArrayOfObject.e(2, this.tID);
      if (this.cIY != null)
        paramArrayOfObject.e(3, this.cIY);
      if (this.title != null)
        paramArrayOfObject.e(4, this.title);
      if (this.tzT != null)
        paramArrayOfObject.e(5, this.tzT);
      if (this.url != null)
        paramArrayOfObject.e(6, this.url);
      if (this.vQG != null)
        paramArrayOfObject.e(7, this.vQG);
      if (this.vQH != null)
        paramArrayOfObject.e(8, this.vQH);
      paramArrayOfObject.iz(9, this.vQI);
      AppMethodBeat.o(56733);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.type) + 0;
        paramInt = i;
        if (this.tID != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.tID);
        int j = paramInt;
        if (this.cIY != null)
          j = paramInt + e.a.a.b.b.a.f(3, this.cIY);
        i = j;
        if (this.title != null)
          i = j + e.a.a.b.b.a.f(4, this.title);
        paramInt = i;
        if (this.tzT != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.tzT);
        i = paramInt;
        if (this.url != null)
          i = paramInt + e.a.a.b.b.a.f(6, this.url);
        paramInt = i;
        if (this.vQG != null)
          paramInt = i + e.a.a.b.b.a.f(7, this.vQG);
        i = paramInt;
        if (this.vQH != null)
          i = paramInt + e.a.a.b.b.a.f(8, this.vQH);
        paramInt = i + e.a.a.b.b.a.bs(9, this.vQI);
        AppMethodBeat.o(56733);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56733);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        mr localmr = (mr)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56733);
          break;
        case 1:
          localmr.type = locala.BTU.vd();
          AppMethodBeat.o(56733);
          paramInt = 0;
          break;
        case 2:
          localmr.tID = locala.BTU.readString();
          AppMethodBeat.o(56733);
          paramInt = 0;
          break;
        case 3:
          localmr.cIY = locala.BTU.readString();
          AppMethodBeat.o(56733);
          paramInt = 0;
          break;
        case 4:
          localmr.title = locala.BTU.readString();
          AppMethodBeat.o(56733);
          paramInt = 0;
          break;
        case 5:
          localmr.tzT = locala.BTU.readString();
          AppMethodBeat.o(56733);
          paramInt = 0;
          break;
        case 6:
          localmr.url = locala.BTU.readString();
          AppMethodBeat.o(56733);
          paramInt = 0;
          break;
        case 7:
          localmr.vQG = locala.BTU.readString();
          AppMethodBeat.o(56733);
          paramInt = 0;
          break;
        case 8:
          localmr.vQH = locala.BTU.readString();
          AppMethodBeat.o(56733);
          paramInt = 0;
          break;
        case 9:
          localmr.vQI = locala.BTU.vd();
          AppMethodBeat.o(56733);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56733);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.mr
 * JD-Core Version:    0.6.2
 */