package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cnf extends com.tencent.mm.bt.a
{
  public String pXM;
  public int vGB;
  public String wVn;
  public String wlF;
  public String wlx;
  public String xkE;
  public int xkF;
  public String xkG;
  public String xkH;
  public int xkI;
  public String xkJ;
  public int xkK;
  public SKBuiltinBuffer_t xkL;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80207);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.pXM != null)
        paramArrayOfObject.e(1, this.pXM);
      if (this.xkE != null)
        paramArrayOfObject.e(2, this.xkE);
      if (this.wlF != null)
        paramArrayOfObject.e(3, this.wlF);
      paramArrayOfObject.iz(4, this.xkF);
      if (this.wVn != null)
        paramArrayOfObject.e(5, this.wVn);
      if (this.xkG != null)
        paramArrayOfObject.e(6, this.xkG);
      if (this.xkH != null)
        paramArrayOfObject.e(7, this.xkH);
      paramArrayOfObject.iz(8, this.xkI);
      if (this.xkJ != null)
        paramArrayOfObject.e(9, this.xkJ);
      paramArrayOfObject.iz(10, this.xkK);
      if (this.xkL != null)
      {
        paramArrayOfObject.iy(11, this.xkL.computeSize());
        this.xkL.writeFields(paramArrayOfObject);
      }
      if (this.wlx != null)
        paramArrayOfObject.e(12, this.wlx);
      paramArrayOfObject.iz(13, this.vGB);
      AppMethodBeat.o(80207);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.pXM == null)
        break label1031;
    label1031: for (i = e.a.a.b.b.a.f(1, this.pXM) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.xkE != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.xkE);
      i = paramInt;
      if (this.wlF != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wlF);
      paramInt = i + e.a.a.b.b.a.bs(4, this.xkF);
      i = paramInt;
      if (this.wVn != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wVn);
      paramInt = i;
      if (this.xkG != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.xkG);
      i = paramInt;
      if (this.xkH != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.xkH);
      i += e.a.a.b.b.a.bs(8, this.xkI);
      paramInt = i;
      if (this.xkJ != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.xkJ);
      i = paramInt + e.a.a.b.b.a.bs(10, this.xkK);
      paramInt = i;
      if (this.xkL != null)
        paramInt = i + e.a.a.a.ix(11, this.xkL.computeSize());
      i = paramInt;
      if (this.wlx != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.wlx);
      paramInt = i + e.a.a.b.b.a.bs(13, this.vGB);
      AppMethodBeat.o(80207);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80207);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cnf localcnf = (cnf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80207);
          break;
        case 1:
          localcnf.pXM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80207);
          paramInt = i;
          break;
        case 2:
          localcnf.xkE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80207);
          paramInt = i;
          break;
        case 3:
          localcnf.wlF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80207);
          paramInt = i;
          break;
        case 4:
          localcnf.xkF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80207);
          paramInt = i;
          break;
        case 5:
          localcnf.wVn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80207);
          paramInt = i;
          break;
        case 6:
          localcnf.xkG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80207);
          paramInt = i;
          break;
        case 7:
          localcnf.xkH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80207);
          paramInt = i;
          break;
        case 8:
          localcnf.xkI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80207);
          paramInt = i;
          break;
        case 9:
          localcnf.xkJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80207);
          paramInt = i;
          break;
        case 10:
          localcnf.xkK = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80207);
          paramInt = i;
          break;
        case 11:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnf.xkL = paramArrayOfObject;
          }
          AppMethodBeat.o(80207);
          paramInt = i;
          break;
        case 12:
          localcnf.wlx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80207);
          paramInt = i;
          break;
        case 13:
          localcnf.vGB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80207);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80207);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cnf
 * JD-Core Version:    0.6.2
 */