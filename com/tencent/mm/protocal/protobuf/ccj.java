package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ccj extends bsr
{
  public String fKh;
  public int jCt;
  public String ptv;
  public int ptw;
  public int ptx;
  public String vEA;
  public SKBuiltinBuffer_t vJd;
  public int vZF;
  public int wFd;
  public int wFe;
  public int wGz;
  public civ wNQ;
  public String wdO;
  public int xbN;
  public int xbO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94620);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vJd == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Buffer");
        AppMethodBeat.o(94620);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.jCt);
      paramArrayOfObject.iz(3, this.ptx);
      paramArrayOfObject.iz(4, this.ptw);
      if (this.vJd != null)
      {
        paramArrayOfObject.iy(5, this.vJd.computeSize());
        this.vJd.writeFields(paramArrayOfObject);
      }
      if (this.ptv != null)
        paramArrayOfObject.e(6, this.ptv);
      paramArrayOfObject.iz(7, this.wFd);
      paramArrayOfObject.iz(8, this.wFe);
      if (this.vEA != null)
        paramArrayOfObject.e(9, this.vEA);
      paramArrayOfObject.iz(10, this.xbN);
      paramArrayOfObject.iz(11, this.vZF);
      if (this.wNQ != null)
      {
        paramArrayOfObject.iy(12, this.wNQ.computeSize());
        this.wNQ.writeFields(paramArrayOfObject);
      }
      if (this.fKh != null)
        paramArrayOfObject.e(13, this.fKh);
      paramArrayOfObject.iz(14, this.wGz);
      if (this.wdO != null)
        paramArrayOfObject.e(15, this.wdO);
      paramArrayOfObject.iz(16, this.xbO);
      AppMethodBeat.o(94620);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1377;
    label1377: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.jCt) + e.a.a.b.b.a.bs(3, this.ptx) + e.a.a.b.b.a.bs(4, this.ptw);
      paramInt = i;
      if (this.vJd != null)
        paramInt = i + e.a.a.a.ix(5, this.vJd.computeSize());
      i = paramInt;
      if (this.ptv != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.ptv);
      i = i + e.a.a.b.b.a.bs(7, this.wFd) + e.a.a.b.b.a.bs(8, this.wFe);
      paramInt = i;
      if (this.vEA != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.vEA);
      i = paramInt + e.a.a.b.b.a.bs(10, this.xbN) + e.a.a.b.b.a.bs(11, this.vZF);
      paramInt = i;
      if (this.wNQ != null)
        paramInt = i + e.a.a.a.ix(12, this.wNQ.computeSize());
      i = paramInt;
      if (this.fKh != null)
        i = paramInt + e.a.a.b.b.a.f(13, this.fKh);
      i += e.a.a.b.b.a.bs(14, this.wGz);
      paramInt = i;
      if (this.wdO != null)
        paramInt = i + e.a.a.b.b.a.f(15, this.wdO);
      paramInt += e.a.a.b.b.a.bs(16, this.xbO);
      AppMethodBeat.o(94620);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vJd == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Buffer");
          AppMethodBeat.o(94620);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(94620);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ccj localccj = (ccj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94620);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localccj.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(94620);
          paramInt = i;
          break;
        case 2:
          localccj.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94620);
          paramInt = i;
          break;
        case 3:
          localccj.ptx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94620);
          paramInt = i;
          break;
        case 4:
          localccj.ptw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94620);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localccj.vJd = paramArrayOfObject;
          }
          AppMethodBeat.o(94620);
          paramInt = i;
          break;
        case 6:
          localccj.ptv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94620);
          paramInt = i;
          break;
        case 7:
          localccj.wFd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94620);
          paramInt = i;
          break;
        case 8:
          localccj.wFe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94620);
          paramInt = i;
          break;
        case 9:
          localccj.vEA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94620);
          paramInt = i;
          break;
        case 10:
          localccj.xbN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94620);
          paramInt = i;
          break;
        case 11:
          localccj.vZF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94620);
          paramInt = i;
          break;
        case 12:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new civ();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((civ)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localccj.wNQ = ((civ)localObject1);
          }
          AppMethodBeat.o(94620);
          paramInt = i;
          break;
        case 13:
          localccj.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94620);
          paramInt = i;
          break;
        case 14:
          localccj.wGz = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94620);
          paramInt = i;
          break;
        case 15:
          localccj.wdO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94620);
          paramInt = i;
          break;
        case 16:
          localccj.xbO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94620);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94620);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ccj
 * JD-Core Version:    0.6.2
 */