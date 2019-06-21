package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class bok extends bsr
{
  public long timestamp;
  public int vZt;
  public int vZu;
  public int wRk;
  public b wRl;
  public b wRm;
  public b wRn;
  public int wRo;
  public hi wmx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48949);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wmx != null)
      {
        paramArrayOfObject.iy(2, this.wmx.computeSize());
        this.wmx.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.wRk);
      if (this.wRl != null)
        paramArrayOfObject.c(4, this.wRl);
      if (this.wRm != null)
        paramArrayOfObject.c(5, this.wRm);
      if (this.wRn != null)
        paramArrayOfObject.c(6, this.wRn);
      paramArrayOfObject.iz(7, this.vZu);
      paramArrayOfObject.iz(8, this.vZt);
      paramArrayOfObject.iz(9, this.wRo);
      paramArrayOfObject.ai(10, this.timestamp);
      AppMethodBeat.o(48949);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label910;
    label910: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wmx != null)
        i = paramInt + e.a.a.a.ix(2, this.wmx.computeSize());
      i += e.a.a.b.b.a.bs(3, this.wRk);
      paramInt = i;
      if (this.wRl != null)
        paramInt = i + e.a.a.b.b.a.b(4, this.wRl);
      i = paramInt;
      if (this.wRm != null)
        i = paramInt + e.a.a.b.b.a.b(5, this.wRm);
      paramInt = i;
      if (this.wRn != null)
        paramInt = i + e.a.a.b.b.a.b(6, this.wRn);
      paramInt = paramInt + e.a.a.b.b.a.bs(7, this.vZu) + e.a.a.b.b.a.bs(8, this.vZt) + e.a.a.b.b.a.bs(9, this.wRo) + e.a.a.b.b.a.o(10, this.timestamp);
      AppMethodBeat.o(48949);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48949);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bok localbok = (bok)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48949);
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
            localbok.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(48949);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbok.wmx = paramArrayOfObject;
          }
          AppMethodBeat.o(48949);
          paramInt = i;
          break;
        case 3:
          localbok.wRk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48949);
          paramInt = i;
          break;
        case 4:
          localbok.wRl = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(48949);
          paramInt = i;
          break;
        case 5:
          localbok.wRm = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(48949);
          paramInt = i;
          break;
        case 6:
          localbok.wRn = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(48949);
          paramInt = i;
          break;
        case 7:
          localbok.vZu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48949);
          paramInt = i;
          break;
        case 8:
          localbok.vZt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48949);
          paramInt = i;
          break;
        case 9:
          localbok.wRo = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48949);
          paramInt = i;
          break;
        case 10:
          localbok.timestamp = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(48949);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48949);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bok
 * JD-Core Version:    0.6.2
 */