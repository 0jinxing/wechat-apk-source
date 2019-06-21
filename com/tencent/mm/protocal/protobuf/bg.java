package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bg extends com.tencent.mm.bt.a
{
  public String mZr;
  public String nad;
  public String ncH;
  public String vDk;
  public String vDl;
  public String vDm;
  public String vDn;
  public String vDo;
  public String vDp;
  public cyf vDq;
  public String vDr;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80006);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZr != null)
        paramArrayOfObject.e(1, this.mZr);
      if (this.vDk != null)
        paramArrayOfObject.e(2, this.vDk);
      if (this.vDl != null)
        paramArrayOfObject.e(3, this.vDl);
      if (this.nad != null)
        paramArrayOfObject.e(4, this.nad);
      if (this.ncH != null)
        paramArrayOfObject.e(5, this.ncH);
      if (this.vDm != null)
        paramArrayOfObject.e(6, this.vDm);
      if (this.vDn != null)
        paramArrayOfObject.e(7, this.vDn);
      if (this.vDo != null)
        paramArrayOfObject.e(8, this.vDo);
      if (this.vDp != null)
        paramArrayOfObject.e(9, this.vDp);
      if (this.vDq != null)
      {
        paramArrayOfObject.iy(10, this.vDq.computeSize());
        this.vDq.writeFields(paramArrayOfObject);
      }
      if (this.vDr != null)
        paramArrayOfObject.e(11, this.vDr);
      AppMethodBeat.o(80006);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZr == null)
        break label969;
    label969: for (i = e.a.a.b.b.a.f(1, this.mZr) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vDk != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vDk);
      i = paramInt;
      if (this.vDl != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vDl);
      paramInt = i;
      if (this.nad != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.nad);
      i = paramInt;
      if (this.ncH != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.ncH);
      paramInt = i;
      if (this.vDm != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vDm);
      i = paramInt;
      if (this.vDn != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.vDn);
      paramInt = i;
      if (this.vDo != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vDo);
      i = paramInt;
      if (this.vDp != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.vDp);
      paramInt = i;
      if (this.vDq != null)
        paramInt = i + e.a.a.a.ix(10, this.vDq.computeSize());
      i = paramInt;
      if (this.vDr != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.vDr);
      AppMethodBeat.o(80006);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80006);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bg localbg = (bg)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80006);
          break;
        case 1:
          localbg.mZr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80006);
          paramInt = i;
          break;
        case 2:
          localbg.vDk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80006);
          paramInt = i;
          break;
        case 3:
          localbg.vDl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80006);
          paramInt = i;
          break;
        case 4:
          localbg.nad = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80006);
          paramInt = i;
          break;
        case 5:
          localbg.ncH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80006);
          paramInt = i;
          break;
        case 6:
          localbg.vDm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80006);
          paramInt = i;
          break;
        case 7:
          localbg.vDn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80006);
          paramInt = i;
          break;
        case 8:
          localbg.vDo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80006);
          paramInt = i;
          break;
        case 9:
          localbg.vDp = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80006);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cyf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbg.vDq = paramArrayOfObject;
          }
          AppMethodBeat.o(80006);
          paramInt = i;
          break;
        case 11:
          localbg.vDr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80006);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80006);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bg
 * JD-Core Version:    0.6.2
 */