package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class gw extends com.tencent.mm.bt.a
{
  public String cFl;
  public String twT;
  public String twV;
  public String twY;
  public String twZ;
  public String vJj;
  public String vJk;
  public String vJl;
  public String vJm;
  public String vJn;
  public String vJo;
  public String vJp;
  public String vJq;
  public String vJr;
  public long vJs;
  public int vJt;
  public String vJu;
  public String vJv;
  public String vJw;
  public String vJx;
  public gx vJy;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56704);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vJj != null)
        paramArrayOfObject.e(1, this.vJj);
      if (this.vJk != null)
        paramArrayOfObject.e(2, this.vJk);
      if (this.vJl != null)
        paramArrayOfObject.e(3, this.vJl);
      if (this.vJm != null)
        paramArrayOfObject.e(4, this.vJm);
      if (this.vJn != null)
        paramArrayOfObject.e(5, this.vJn);
      if (this.vJo != null)
        paramArrayOfObject.e(6, this.vJo);
      if (this.vJp != null)
        paramArrayOfObject.e(7, this.vJp);
      if (this.vJq != null)
        paramArrayOfObject.e(8, this.vJq);
      if (this.cFl != null)
        paramArrayOfObject.e(9, this.cFl);
      if (this.vJr != null)
        paramArrayOfObject.e(10, this.vJr);
      if (this.twV != null)
        paramArrayOfObject.e(11, this.twV);
      if (this.twZ != null)
        paramArrayOfObject.e(12, this.twZ);
      if (this.twY != null)
        paramArrayOfObject.e(13, this.twY);
      paramArrayOfObject.ai(14, this.vJs);
      paramArrayOfObject.iz(15, this.vJt);
      if (this.vJu != null)
        paramArrayOfObject.e(16, this.vJu);
      if (this.vJv != null)
        paramArrayOfObject.e(17, this.vJv);
      if (this.vJw != null)
        paramArrayOfObject.e(18, this.vJw);
      if (this.twT != null)
        paramArrayOfObject.e(19, this.twT);
      if (this.vJx != null)
        paramArrayOfObject.e(20, this.vJx);
      if (this.vJy != null)
      {
        paramArrayOfObject.iy(21, this.vJy.computeSize());
        this.vJy.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(56704);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vJj == null)
        break label1587;
    label1587: for (paramInt = e.a.a.b.b.a.f(1, this.vJj) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vJk != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vJk);
      paramInt = i;
      if (this.vJl != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vJl);
      i = paramInt;
      if (this.vJm != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vJm);
      paramInt = i;
      if (this.vJn != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vJn);
      i = paramInt;
      if (this.vJo != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.vJo);
      paramInt = i;
      if (this.vJp != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vJp);
      i = paramInt;
      if (this.vJq != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.vJq);
      paramInt = i;
      if (this.cFl != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.cFl);
      i = paramInt;
      if (this.vJr != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.vJr);
      int j = i;
      if (this.twV != null)
        j = i + e.a.a.b.b.a.f(11, this.twV);
      paramInt = j;
      if (this.twZ != null)
        paramInt = j + e.a.a.b.b.a.f(12, this.twZ);
      i = paramInt;
      if (this.twY != null)
        i = paramInt + e.a.a.b.b.a.f(13, this.twY);
      paramInt = i + e.a.a.b.b.a.o(14, this.vJs) + e.a.a.b.b.a.bs(15, this.vJt);
      i = paramInt;
      if (this.vJu != null)
        i = paramInt + e.a.a.b.b.a.f(16, this.vJu);
      paramInt = i;
      if (this.vJv != null)
        paramInt = i + e.a.a.b.b.a.f(17, this.vJv);
      i = paramInt;
      if (this.vJw != null)
        i = paramInt + e.a.a.b.b.a.f(18, this.vJw);
      paramInt = i;
      if (this.twT != null)
        paramInt = i + e.a.a.b.b.a.f(19, this.twT);
      i = paramInt;
      if (this.vJx != null)
        i = paramInt + e.a.a.b.b.a.f(20, this.vJx);
      paramInt = i;
      if (this.vJy != null)
        paramInt = i + e.a.a.a.ix(21, this.vJy.computeSize());
      AppMethodBeat.o(56704);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56704);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        gw localgw = (gw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56704);
          break;
        case 1:
          localgw.vJj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56704);
          paramInt = i;
          break;
        case 2:
          localgw.vJk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56704);
          paramInt = i;
          break;
        case 3:
          localgw.vJl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56704);
          paramInt = i;
          break;
        case 4:
          localgw.vJm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56704);
          paramInt = i;
          break;
        case 5:
          localgw.vJn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56704);
          paramInt = i;
          break;
        case 6:
          localgw.vJo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56704);
          paramInt = i;
          break;
        case 7:
          localgw.vJp = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56704);
          paramInt = i;
          break;
        case 8:
          localgw.vJq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56704);
          paramInt = i;
          break;
        case 9:
          localgw.cFl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56704);
          paramInt = i;
          break;
        case 10:
          localgw.vJr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56704);
          paramInt = i;
          break;
        case 11:
          localgw.twV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56704);
          paramInt = i;
          break;
        case 12:
          localgw.twZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56704);
          paramInt = i;
          break;
        case 13:
          localgw.twY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56704);
          paramInt = i;
          break;
        case 14:
          localgw.vJs = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56704);
          paramInt = i;
          break;
        case 15:
          localgw.vJt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56704);
          paramInt = i;
          break;
        case 16:
          localgw.vJu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56704);
          paramInt = i;
          break;
        case 17:
          localgw.vJv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56704);
          paramInt = i;
          break;
        case 18:
          localgw.vJw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56704);
          paramInt = i;
          break;
        case 19:
          localgw.twT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56704);
          paramInt = i;
          break;
        case 20:
          localgw.vJx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56704);
          paramInt = i;
          break;
        case 21:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new gx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localgw.vJy = paramArrayOfObject;
          }
          AppMethodBeat.o(56704);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56704);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.gw
 * JD-Core Version:    0.6.2
 */