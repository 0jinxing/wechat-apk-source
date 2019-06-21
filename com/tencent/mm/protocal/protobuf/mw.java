package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class mw extends com.tencent.mm.bt.a
{
  public int luF;
  public int vQV;
  public int vQW;
  public int vQX;
  public int vQY;
  public LinkedList<bts> vQZ;
  public String vRa;
  public SKBuiltinBuffer_t vRb;
  public int vRc;
  public int vRd;
  public LinkedList<bts> vRe;
  public LinkedList<mx> vRf;
  public LinkedList<mx> vRg;
  public int vRh;
  public int vRi;

  public mw()
  {
    AppMethodBeat.i(58898);
    this.vQZ = new LinkedList();
    this.vRe = new LinkedList();
    this.vRf = new LinkedList();
    this.vRg = new LinkedList();
    AppMethodBeat.o(58898);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(58899);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vRb == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AuthKey");
        AppMethodBeat.o(58899);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.vQV);
      paramArrayOfObject.iz(2, this.luF);
      paramArrayOfObject.iz(3, this.vQW);
      paramArrayOfObject.iz(4, this.vQX);
      paramArrayOfObject.iz(5, this.vQY);
      paramArrayOfObject.e(6, 8, this.vQZ);
      if (this.vRa != null)
        paramArrayOfObject.e(7, this.vRa);
      if (this.vRb != null)
      {
        paramArrayOfObject.iy(8, this.vRb.computeSize());
        this.vRb.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(9, this.vRc);
      paramArrayOfObject.iz(10, this.vRd);
      paramArrayOfObject.e(11, 8, this.vRe);
      paramArrayOfObject.e(12, 8, this.vRf);
      paramArrayOfObject.e(13, 8, this.vRg);
      paramArrayOfObject.iz(14, this.vRh);
      paramArrayOfObject.iz(15, this.vRi);
      AppMethodBeat.o(58899);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.vQV) + 0 + e.a.a.b.b.a.bs(2, this.luF) + e.a.a.b.b.a.bs(3, this.vQW) + e.a.a.b.b.a.bs(4, this.vQX) + e.a.a.b.b.a.bs(5, this.vQY) + e.a.a.a.c(6, 8, this.vQZ);
        paramInt = i;
        if (this.vRa != null)
          paramInt = i + e.a.a.b.b.a.f(7, this.vRa);
        i = paramInt;
        if (this.vRb != null)
          i = paramInt + e.a.a.a.ix(8, this.vRb.computeSize());
        paramInt = i + e.a.a.b.b.a.bs(9, this.vRc) + e.a.a.b.b.a.bs(10, this.vRd) + e.a.a.a.c(11, 8, this.vRe) + e.a.a.a.c(12, 8, this.vRf) + e.a.a.a.c(13, 8, this.vRg) + e.a.a.b.b.a.bs(14, this.vRh) + e.a.a.b.b.a.bs(15, this.vRi);
        AppMethodBeat.o(58899);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vQZ.clear();
        this.vRe.clear();
        this.vRf.clear();
        this.vRg.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vRb == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AuthKey");
          AppMethodBeat.o(58899);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(58899);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        mw localmw = (mw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(58899);
          break;
        case 1:
          localmw.vQV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58899);
          paramInt = 0;
          break;
        case 2:
          localmw.luF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58899);
          paramInt = 0;
          break;
        case 3:
          localmw.vQW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58899);
          paramInt = 0;
          break;
        case 4:
          localmw.vQX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58899);
          paramInt = 0;
          break;
        case 5:
          localmw.vQY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58899);
          paramInt = 0;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localmw.vQZ.add(localObject1);
          }
          AppMethodBeat.o(58899);
          paramInt = 0;
          break;
        case 7:
          localmw.vRa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58899);
          paramInt = 0;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localmw.vRb = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(58899);
          paramInt = 0;
          break;
        case 9:
          localmw.vRc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58899);
          paramInt = 0;
          break;
        case 10:
          localmw.vRd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58899);
          paramInt = 0;
          break;
        case 11:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localmw.vRe.add(paramArrayOfObject);
          }
          AppMethodBeat.o(58899);
          paramInt = 0;
          break;
        case 12:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new mx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localmw.vRf.add(paramArrayOfObject);
          }
          AppMethodBeat.o(58899);
          paramInt = 0;
          break;
        case 13:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new mx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((mx)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localmw.vRg.add(localObject1);
          }
          AppMethodBeat.o(58899);
          paramInt = 0;
          break;
        case 14:
          localmw.vRh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58899);
          paramInt = 0;
          break;
        case 15:
          localmw.vRi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58899);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(58899);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.mw
 * JD-Core Version:    0.6.2
 */