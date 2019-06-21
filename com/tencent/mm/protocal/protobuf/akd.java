package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class akd extends bsr
{
  public String wdB;
  public String wjV;
  public String wjW;
  public String wjX;
  public String wpE;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56814);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wjV != null)
        paramArrayOfObject.e(2, this.wjV);
      if (this.wpE != null)
        paramArrayOfObject.e(3, this.wpE);
      if (this.wjW != null)
        paramArrayOfObject.e(4, this.wjW);
      if (this.wjX != null)
        paramArrayOfObject.e(5, this.wjX);
      if (this.wdB != null)
        paramArrayOfObject.e(6, this.wdB);
      AppMethodBeat.o(56814);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label642;
    label642: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wjV != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wjV);
      paramInt = i;
      if (this.wpE != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wpE);
      i = paramInt;
      if (this.wjW != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wjW);
      paramInt = i;
      if (this.wjX != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wjX);
      i = paramInt;
      if (this.wdB != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wdB);
      AppMethodBeat.o(56814);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56814);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        akd localakd = (akd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56814);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localakd.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(56814);
          paramInt = i;
          break;
        case 2:
          localakd.wjV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56814);
          paramInt = i;
          break;
        case 3:
          localakd.wpE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56814);
          paramInt = i;
          break;
        case 4:
          localakd.wjW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56814);
          paramInt = i;
          break;
        case 5:
          localakd.wjX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56814);
          paramInt = i;
          break;
        case 6:
          localakd.wdB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56814);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56814);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.akd
 * JD-Core Version:    0.6.2
 */