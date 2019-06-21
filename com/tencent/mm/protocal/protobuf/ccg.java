package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class ccg extends bsr
{
  public String wZT;
  public long wZU;
  public SKBuiltinBuffer_t wZw;
  public int wZy;
  public LinkedList<Long> xbA;
  public int xbB;
  public long xbw;
  public int xbx;
  public long xby;
  public int xbz;

  public ccg()
  {
    AppMethodBeat.i(94616);
    this.xbA = new LinkedList();
    AppMethodBeat.o(94616);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94617);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wZT != null)
        paramArrayOfObject.e(2, this.wZT);
      paramArrayOfObject.ai(3, this.wZU);
      paramArrayOfObject.ai(4, this.xbw);
      paramArrayOfObject.iz(5, this.xbx);
      paramArrayOfObject.ai(6, this.xby);
      if (this.wZw != null)
      {
        paramArrayOfObject.iy(7, this.wZw.computeSize());
        this.wZw.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(8, this.wZy);
      paramArrayOfObject.iz(11, this.xbz);
      paramArrayOfObject.f(12, 3, this.xbA);
      paramArrayOfObject.iz(13, this.xbB);
      AppMethodBeat.o(94617);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label998;
    label998: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wZT != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wZT);
      i = i + e.a.a.b.b.a.o(3, this.wZU) + e.a.a.b.b.a.o(4, this.xbw) + e.a.a.b.b.a.bs(5, this.xbx) + e.a.a.b.b.a.o(6, this.xby);
      paramInt = i;
      if (this.wZw != null)
        paramInt = i + e.a.a.a.ix(7, this.wZw.computeSize());
      paramInt = paramInt + e.a.a.b.b.a.bs(8, this.wZy) + e.a.a.b.b.a.bs(11, this.xbz) + e.a.a.a.d(12, 3, this.xbA) + e.a.a.b.b.a.bs(13, this.xbB);
      AppMethodBeat.o(94617);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xbA.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94617);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ccg localccg = (ccg)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 9:
        case 10:
        default:
          paramInt = -1;
          AppMethodBeat.o(94617);
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
            localccg.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(94617);
          paramInt = i;
          break;
        case 2:
          localccg.wZT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94617);
          paramInt = i;
          break;
        case 3:
          localccg.wZU = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(94617);
          paramInt = i;
          break;
        case 4:
          localccg.xbw = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(94617);
          paramInt = i;
          break;
        case 5:
          localccg.xbx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94617);
          paramInt = i;
          break;
        case 6:
          localccg.xby = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(94617);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localccg.wZw = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(94617);
          paramInt = i;
          break;
        case 8:
          localccg.wZy = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94617);
          paramInt = i;
          break;
        case 11:
          localccg.xbz = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94617);
          paramInt = i;
          break;
        case 12:
          localObject1 = new e.a.a.a.a(((e.a.a.a.a)localObject1).BTU.emu().wR, unknownTagHandler).BTU;
          paramArrayOfObject = new LinkedList();
          while (true)
          {
            if (((e.a.a.b.a.a)localObject1).bxm >= ((e.a.a.b.a.a)localObject1).bufferSize)
            {
              localccg.xbA = paramArrayOfObject;
              AppMethodBeat.o(94617);
              paramInt = i;
              break;
            }
            paramArrayOfObject.add(Long.valueOf(((e.a.a.b.a.a)localObject1).ve()));
          }
        case 13:
          localccg.xbB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94617);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94617);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ccg
 * JD-Core Version:    0.6.2
 */