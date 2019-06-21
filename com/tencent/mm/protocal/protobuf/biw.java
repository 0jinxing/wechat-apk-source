package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class biw extends com.tencent.mm.bt.a
{
  public String cEh;
  public String cIY;
  public int tBA;
  public int tBB;
  public long tBC;
  public String tBl;
  public long tBx;
  public long tBy;
  public long tBz;
  public String tID;
  public String title;
  public String type;
  public String tzT;
  public String url;
  public String wMj;
  public String wMk;
  public String wMl;
  public int wMm;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56883);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.url != null)
        paramArrayOfObject.e(1, this.url);
      if (this.cEh != null)
        paramArrayOfObject.e(2, this.cEh);
      if (this.cIY != null)
        paramArrayOfObject.e(3, this.cIY);
      if (this.tID != null)
        paramArrayOfObject.e(4, this.tID);
      if (this.tBl != null)
        paramArrayOfObject.e(5, this.tBl);
      if (this.wMj != null)
        paramArrayOfObject.e(6, this.wMj);
      if (this.type != null)
        paramArrayOfObject.e(7, this.type);
      if (this.title != null)
        paramArrayOfObject.e(8, this.title);
      paramArrayOfObject.ai(9, this.tBx);
      paramArrayOfObject.ai(10, this.tBy);
      if (this.tzT != null)
        paramArrayOfObject.e(11, this.tzT);
      paramArrayOfObject.ai(12, this.tBz);
      paramArrayOfObject.iz(13, this.tBA);
      paramArrayOfObject.iz(14, this.tBB);
      if (this.wMk != null)
        paramArrayOfObject.e(15, this.wMk);
      if (this.wMl != null)
        paramArrayOfObject.e(16, this.wMl);
      paramArrayOfObject.ai(17, this.tBC);
      paramArrayOfObject.iz(18, this.wMm);
      AppMethodBeat.o(56883);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.url == null)
        break label1206;
    label1206: for (i = e.a.a.b.b.a.f(1, this.url) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.cEh != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.cEh);
      i = paramInt;
      if (this.cIY != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.cIY);
      paramInt = i;
      if (this.tID != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.tID);
      i = paramInt;
      if (this.tBl != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.tBl);
      paramInt = i;
      if (this.wMj != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wMj);
      i = paramInt;
      if (this.type != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.type);
      paramInt = i;
      if (this.title != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.title);
      i = paramInt + e.a.a.b.b.a.o(9, this.tBx) + e.a.a.b.b.a.o(10, this.tBy);
      paramInt = i;
      if (this.tzT != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.tzT);
      i = paramInt + e.a.a.b.b.a.o(12, this.tBz) + e.a.a.b.b.a.bs(13, this.tBA) + e.a.a.b.b.a.bs(14, this.tBB);
      paramInt = i;
      if (this.wMk != null)
        paramInt = i + e.a.a.b.b.a.f(15, this.wMk);
      i = paramInt;
      if (this.wMl != null)
        i = paramInt + e.a.a.b.b.a.f(16, this.wMl);
      paramInt = i + e.a.a.b.b.a.o(17, this.tBC) + e.a.a.b.b.a.bs(18, this.wMm);
      AppMethodBeat.o(56883);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56883);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        biw localbiw = (biw)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56883);
          break;
        case 1:
          localbiw.url = locala.BTU.readString();
          AppMethodBeat.o(56883);
          paramInt = i;
          break;
        case 2:
          localbiw.cEh = locala.BTU.readString();
          AppMethodBeat.o(56883);
          paramInt = i;
          break;
        case 3:
          localbiw.cIY = locala.BTU.readString();
          AppMethodBeat.o(56883);
          paramInt = i;
          break;
        case 4:
          localbiw.tID = locala.BTU.readString();
          AppMethodBeat.o(56883);
          paramInt = i;
          break;
        case 5:
          localbiw.tBl = locala.BTU.readString();
          AppMethodBeat.o(56883);
          paramInt = i;
          break;
        case 6:
          localbiw.wMj = locala.BTU.readString();
          AppMethodBeat.o(56883);
          paramInt = i;
          break;
        case 7:
          localbiw.type = locala.BTU.readString();
          AppMethodBeat.o(56883);
          paramInt = i;
          break;
        case 8:
          localbiw.title = locala.BTU.readString();
          AppMethodBeat.o(56883);
          paramInt = i;
          break;
        case 9:
          localbiw.tBx = locala.BTU.ve();
          AppMethodBeat.o(56883);
          paramInt = i;
          break;
        case 10:
          localbiw.tBy = locala.BTU.ve();
          AppMethodBeat.o(56883);
          paramInt = i;
          break;
        case 11:
          localbiw.tzT = locala.BTU.readString();
          AppMethodBeat.o(56883);
          paramInt = i;
          break;
        case 12:
          localbiw.tBz = locala.BTU.ve();
          AppMethodBeat.o(56883);
          paramInt = i;
          break;
        case 13:
          localbiw.tBA = locala.BTU.vd();
          AppMethodBeat.o(56883);
          paramInt = i;
          break;
        case 14:
          localbiw.tBB = locala.BTU.vd();
          AppMethodBeat.o(56883);
          paramInt = i;
          break;
        case 15:
          localbiw.wMk = locala.BTU.readString();
          AppMethodBeat.o(56883);
          paramInt = i;
          break;
        case 16:
          localbiw.wMl = locala.BTU.readString();
          AppMethodBeat.o(56883);
          paramInt = i;
          break;
        case 17:
          localbiw.tBC = locala.BTU.ve();
          AppMethodBeat.o(56883);
          paramInt = i;
          break;
        case 18:
          localbiw.wMm = locala.BTU.vd();
          AppMethodBeat.o(56883);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56883);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.biw
 * JD-Core Version:    0.6.2
 */