package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ys extends bsr
{
  public String fKh;
  public int pXD;
  public aw vRP;
  public String wes;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56773);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wes != null)
        paramArrayOfObject.e(2, this.wes);
      if (this.fKh != null)
        paramArrayOfObject.e(3, this.fKh);
      paramArrayOfObject.iz(4, this.pXD);
      if (this.vRP != null)
      {
        paramArrayOfObject.iy(5, this.vRP.computeSize());
        this.vRP.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(56773);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label655;
    label655: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wes != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wes);
      i = paramInt;
      if (this.fKh != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.fKh);
      i += e.a.a.b.b.a.bs(4, this.pXD);
      paramInt = i;
      if (this.vRP != null)
        paramInt = i + e.a.a.a.ix(5, this.vRP.computeSize());
      AppMethodBeat.o(56773);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56773);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ys localys = (ys)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56773);
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
            localys.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(56773);
          paramInt = i;
          break;
        case 2:
          localys.wes = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56773);
          paramInt = i;
          break;
        case 3:
          localys.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56773);
          paramInt = i;
          break;
        case 4:
          localys.pXD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56773);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new aw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localys.vRP = paramArrayOfObject;
          }
          AppMethodBeat.o(56773);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56773);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ys
 * JD-Core Version:    0.6.2
 */