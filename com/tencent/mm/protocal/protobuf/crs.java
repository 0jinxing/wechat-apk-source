package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class crs extends com.tencent.mm.bt.a
{
  public SKBuiltinBuffer_t xpk;
  public SKBuiltinBuffer_t xpl;
  public SKBuiltinBuffer_t xpm;
  public SKBuiltinBuffer_t xpn;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(123522);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xpk != null)
      {
        paramArrayOfObject.iy(1, this.xpk.computeSize());
        this.xpk.writeFields(paramArrayOfObject);
      }
      if (this.xpl != null)
      {
        paramArrayOfObject.iy(2, this.xpl.computeSize());
        this.xpl.writeFields(paramArrayOfObject);
      }
      if (this.xpm != null)
      {
        paramArrayOfObject.iy(3, this.xpm.computeSize());
        this.xpm.writeFields(paramArrayOfObject);
      }
      if (this.xpn != null)
      {
        paramArrayOfObject.iy(4, this.xpn.computeSize());
        this.xpn.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(123522);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xpk == null)
        break label799;
    label799: for (paramInt = e.a.a.a.ix(1, this.xpk.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.xpl != null)
        i = paramInt + e.a.a.a.ix(2, this.xpl.computeSize());
      paramInt = i;
      if (this.xpm != null)
        paramInt = i + e.a.a.a.ix(3, this.xpm.computeSize());
      i = paramInt;
      if (this.xpn != null)
        i = paramInt + e.a.a.a.ix(4, this.xpn.computeSize());
      AppMethodBeat.o(123522);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(123522);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        crs localcrs = (crs)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(123522);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcrs.xpk = paramArrayOfObject;
          }
          AppMethodBeat.o(123522);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcrs.xpl = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(123522);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcrs.xpm = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(123522);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcrs.xpn = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(123522);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(123522);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.crs
 * JD-Core Version:    0.6.2
 */