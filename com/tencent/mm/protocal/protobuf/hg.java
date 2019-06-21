package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class hg extends com.tencent.mm.bt.a
{
  public String title;
  public btr vCP;
  public String vJS;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48778);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      if (this.vCP != null)
      {
        paramArrayOfObject.iy(2, this.vCP.computeSize());
        this.vCP.writeFields(paramArrayOfObject);
      }
      if (this.vJS != null)
        paramArrayOfObject.e(3, this.vJS);
      AppMethodBeat.o(48778);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label454;
    label454: for (i = e.a.a.b.b.a.f(1, this.title) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vCP != null)
        paramInt = i + e.a.a.a.ix(2, this.vCP.computeSize());
      i = paramInt;
      if (this.vJS != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vJS);
      AppMethodBeat.o(48778);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48778);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        hg localhg = (hg)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48778);
          break;
        case 1:
          localhg.title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48778);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new btr();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((btr)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localhg.vCP = ((btr)localObject1);
          }
          AppMethodBeat.o(48778);
          paramInt = i;
          break;
        case 3:
          localhg.vJS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48778);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48778);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.hg
 * JD-Core Version:    0.6.2
 */