package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.hl;
import e.a.a.b;
import java.util.LinkedList;

public final class e extends bsr
{
  public String ptA;
  public String ptB;
  public int ptC;
  public String ptv;
  public int ptw;
  public int ptx;
  public int pty;
  public SKBuiltinBuffer_t ptz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(67924);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ptz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Data");
        AppMethodBeat.o(67924);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.ptv != null)
        paramArrayOfObject.e(2, this.ptv);
      paramArrayOfObject.iz(3, this.ptw);
      paramArrayOfObject.iz(4, this.ptx);
      paramArrayOfObject.iz(5, this.pty);
      if (this.ptz != null)
      {
        paramArrayOfObject.iy(6, this.ptz.computeSize());
        this.ptz.writeFields(paramArrayOfObject);
      }
      if (this.ptA != null)
        paramArrayOfObject.e(7, this.ptA);
      if (this.ptB != null)
        paramArrayOfObject.e(9, this.ptB);
      paramArrayOfObject.iz(10, this.ptC);
      AppMethodBeat.o(67924);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label916;
    label916: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.ptv != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.ptv);
      i = i + e.a.a.b.b.a.bs(3, this.ptw) + e.a.a.b.b.a.bs(4, this.ptx) + e.a.a.b.b.a.bs(5, this.pty);
      paramInt = i;
      if (this.ptz != null)
        paramInt = i + e.a.a.a.ix(6, this.ptz.computeSize());
      i = paramInt;
      if (this.ptA != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.ptA);
      paramInt = i;
      if (this.ptB != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.ptB);
      paramInt += e.a.a.b.b.a.bs(10, this.ptC);
      AppMethodBeat.o(67924);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.ptz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Data");
          AppMethodBeat.o(67924);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(67924);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        e locale = (e)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 8:
        default:
          paramInt = -1;
          AppMethodBeat.o(67924);
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
            locale.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(67924);
          paramInt = i;
          break;
        case 2:
          locale.ptv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(67924);
          paramInt = i;
          break;
        case 3:
          locale.ptw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(67924);
          paramInt = i;
          break;
        case 4:
          locale.ptx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(67924);
          paramInt = i;
          break;
        case 5:
          locale.pty = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(67924);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locale.ptz = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(67924);
          paramInt = i;
          break;
        case 7:
          locale.ptA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(67924);
          paramInt = i;
          break;
        case 9:
          locale.ptB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(67924);
          paramInt = i;
          break;
        case 10:
          locale.ptC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(67924);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(67924);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.e
 * JD-Core Version:    0.6.2
 */