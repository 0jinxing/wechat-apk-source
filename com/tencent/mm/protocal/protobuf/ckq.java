package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ckq extends bsr
{
  public String fKh;
  public String jBB;
  public int jCt;
  public int ptw;
  public int ptx;
  public int pty;
  public SKBuiltinBuffer_t ptz;
  public int vFE;
  public String wdO;
  public String xit;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28687);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ptz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Data");
        AppMethodBeat.o(28687);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.fKh != null)
        paramArrayOfObject.e(2, this.fKh);
      paramArrayOfObject.iz(3, this.vFE);
      if (this.xit != null)
        paramArrayOfObject.e(4, this.xit);
      if (this.jBB != null)
        paramArrayOfObject.e(5, this.jBB);
      paramArrayOfObject.iz(6, this.ptw);
      paramArrayOfObject.iz(7, this.ptx);
      paramArrayOfObject.iz(8, this.pty);
      if (this.ptz != null)
      {
        paramArrayOfObject.iy(9, this.ptz.computeSize());
        this.ptz.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(10, this.jCt);
      if (this.wdO != null)
        paramArrayOfObject.e(11, this.wdO);
      AppMethodBeat.o(28687);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1042;
    label1042: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.fKh != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.fKh);
      i += e.a.a.b.b.a.bs(3, this.vFE);
      paramInt = i;
      if (this.xit != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.xit);
      i = paramInt;
      if (this.jBB != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.jBB);
      i = i + e.a.a.b.b.a.bs(6, this.ptw) + e.a.a.b.b.a.bs(7, this.ptx) + e.a.a.b.b.a.bs(8, this.pty);
      paramInt = i;
      if (this.ptz != null)
        paramInt = i + e.a.a.a.ix(9, this.ptz.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(10, this.jCt);
      paramInt = i;
      if (this.wdO != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.wdO);
      AppMethodBeat.o(28687);
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
          AppMethodBeat.o(28687);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28687);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ckq localckq = (ckq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28687);
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
            localckq.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(28687);
          paramInt = i;
          break;
        case 2:
          localckq.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28687);
          paramInt = i;
          break;
        case 3:
          localckq.vFE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28687);
          paramInt = i;
          break;
        case 4:
          localckq.xit = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28687);
          paramInt = i;
          break;
        case 5:
          localckq.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28687);
          paramInt = i;
          break;
        case 6:
          localckq.ptw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28687);
          paramInt = i;
          break;
        case 7:
          localckq.ptx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28687);
          paramInt = i;
          break;
        case 8:
          localckq.pty = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28687);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localckq.ptz = paramArrayOfObject;
          }
          AppMethodBeat.o(28687);
          paramInt = i;
          break;
        case 10:
          localckq.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28687);
          paramInt = i;
          break;
        case 11:
          localckq.wdO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28687);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28687);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ckq
 * JD-Core Version:    0.6.2
 */