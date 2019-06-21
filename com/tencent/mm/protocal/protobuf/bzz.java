package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class bzz extends com.tencent.mm.bt.a
{
  public int Scene;
  public String Title;
  public String Url;
  public String wYV;
  public String wYW;
  public String wYX;
  public int wYY;
  public String wYZ;
  public String wZa;
  public String wZb;
  public int wZc;
  public int wZd;
  public int wZe;
  public int wZf;
  public int wZg;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124363);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wYV == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: PickedWord");
        AppMethodBeat.o(124363);
        throw paramArrayOfObject;
      }
      if (this.wYV != null)
        paramArrayOfObject.e(1, this.wYV);
      if (this.wYW != null)
        paramArrayOfObject.e(2, this.wYW);
      if (this.wYX != null)
        paramArrayOfObject.e(3, this.wYX);
      paramArrayOfObject.iz(4, this.Scene);
      paramArrayOfObject.iz(5, this.wYY);
      if (this.Url != null)
        paramArrayOfObject.e(6, this.Url);
      if (this.Title != null)
        paramArrayOfObject.e(7, this.Title);
      if (this.wYZ != null)
        paramArrayOfObject.e(8, this.wYZ);
      if (this.wZa != null)
        paramArrayOfObject.e(9, this.wZa);
      if (this.wZb != null)
        paramArrayOfObject.e(10, this.wZb);
      paramArrayOfObject.iz(11, this.wZc);
      paramArrayOfObject.iz(12, this.wZd);
      paramArrayOfObject.iz(13, this.wZe);
      paramArrayOfObject.iz(14, this.wZf);
      paramArrayOfObject.iz(15, this.wZg);
      AppMethodBeat.o(124363);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wYV == null)
        break label1061;
    label1061: for (i = e.a.a.b.b.a.f(1, this.wYV) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wYW != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wYW);
      i = paramInt;
      if (this.wYX != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wYX);
      i = i + e.a.a.b.b.a.bs(4, this.Scene) + e.a.a.b.b.a.bs(5, this.wYY);
      paramInt = i;
      if (this.Url != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.Url);
      int j = paramInt;
      if (this.Title != null)
        j = paramInt + e.a.a.b.b.a.f(7, this.Title);
      i = j;
      if (this.wYZ != null)
        i = j + e.a.a.b.b.a.f(8, this.wYZ);
      paramInt = i;
      if (this.wZa != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.wZa);
      i = paramInt;
      if (this.wZb != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.wZb);
      paramInt = i + e.a.a.b.b.a.bs(11, this.wZc) + e.a.a.b.b.a.bs(12, this.wZd) + e.a.a.b.b.a.bs(13, this.wZe) + e.a.a.b.b.a.bs(14, this.wZf) + e.a.a.b.b.a.bs(15, this.wZg);
      AppMethodBeat.o(124363);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wYV == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: PickedWord");
          AppMethodBeat.o(124363);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(124363);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bzz localbzz = (bzz)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124363);
          break;
        case 1:
          localbzz.wYV = locala.BTU.readString();
          AppMethodBeat.o(124363);
          paramInt = i;
          break;
        case 2:
          localbzz.wYW = locala.BTU.readString();
          AppMethodBeat.o(124363);
          paramInt = i;
          break;
        case 3:
          localbzz.wYX = locala.BTU.readString();
          AppMethodBeat.o(124363);
          paramInt = i;
          break;
        case 4:
          localbzz.Scene = locala.BTU.vd();
          AppMethodBeat.o(124363);
          paramInt = i;
          break;
        case 5:
          localbzz.wYY = locala.BTU.vd();
          AppMethodBeat.o(124363);
          paramInt = i;
          break;
        case 6:
          localbzz.Url = locala.BTU.readString();
          AppMethodBeat.o(124363);
          paramInt = i;
          break;
        case 7:
          localbzz.Title = locala.BTU.readString();
          AppMethodBeat.o(124363);
          paramInt = i;
          break;
        case 8:
          localbzz.wYZ = locala.BTU.readString();
          AppMethodBeat.o(124363);
          paramInt = i;
          break;
        case 9:
          localbzz.wZa = locala.BTU.readString();
          AppMethodBeat.o(124363);
          paramInt = i;
          break;
        case 10:
          localbzz.wZb = locala.BTU.readString();
          AppMethodBeat.o(124363);
          paramInt = i;
          break;
        case 11:
          localbzz.wZc = locala.BTU.vd();
          AppMethodBeat.o(124363);
          paramInt = i;
          break;
        case 12:
          localbzz.wZd = locala.BTU.vd();
          AppMethodBeat.o(124363);
          paramInt = i;
          break;
        case 13:
          localbzz.wZe = locala.BTU.vd();
          AppMethodBeat.o(124363);
          paramInt = i;
          break;
        case 14:
          localbzz.wZf = locala.BTU.vd();
          AppMethodBeat.o(124363);
          paramInt = i;
          break;
        case 15:
          localbzz.wZg = locala.BTU.vd();
          AppMethodBeat.o(124363);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(124363);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bzz
 * JD-Core Version:    0.6.2
 */