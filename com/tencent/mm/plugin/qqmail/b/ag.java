package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.hl;
import e.a.a.b;
import java.util.LinkedList;

public final class ag extends bsr
{
  public String ptv;
  public int ptw;
  public int ptx;
  public int pty;
  public SKBuiltinBuffer_t ptz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(68073);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ptz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Data");
        AppMethodBeat.o(68073);
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
      AppMethodBeat.o(68073);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label730;
    label730: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.ptv != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.ptv);
      i = i + e.a.a.b.b.a.bs(3, this.ptw) + e.a.a.b.b.a.bs(4, this.ptx) + e.a.a.b.b.a.bs(5, this.pty);
      paramInt = i;
      if (this.ptz != null)
        paramInt = i + e.a.a.a.ix(6, this.ptz.computeSize());
      AppMethodBeat.o(68073);
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
          AppMethodBeat.o(68073);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(68073);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ag localag = (ag)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(68073);
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
            localag.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(68073);
          paramInt = i;
          break;
        case 2:
          localag.ptv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(68073);
          paramInt = i;
          break;
        case 3:
          localag.ptw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(68073);
          paramInt = i;
          break;
        case 4:
          localag.ptx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(68073);
          paramInt = i;
          break;
        case 5:
          localag.pty = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(68073);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localag.ptz = paramArrayOfObject;
          }
          AppMethodBeat.o(68073);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(68073);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.ag
 * JD-Core Version:    0.6.2
 */