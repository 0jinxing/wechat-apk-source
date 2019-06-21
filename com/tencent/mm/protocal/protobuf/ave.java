package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ave extends com.tencent.mm.bt.a
{
  public String vJS;
  public cgv wza;
  public LinkedList<cgd> wzb;
  public cgv wzc;

  public ave()
  {
    AppMethodBeat.i(48879);
    this.wzb = new LinkedList();
    AppMethodBeat.o(48879);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48880);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wza != null)
      {
        paramArrayOfObject.iy(1, this.wza.computeSize());
        this.wza.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 8, this.wzb);
      if (this.wzc != null)
      {
        paramArrayOfObject.iy(3, this.wzc.computeSize());
        this.wzc.writeFields(paramArrayOfObject);
      }
      if (this.vJS != null)
        paramArrayOfObject.e(4, this.vJS);
      AppMethodBeat.o(48880);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wza == null)
        break label693;
    label693: for (paramInt = e.a.a.a.ix(1, this.wza.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 8, this.wzb);
      paramInt = i;
      if (this.wzc != null)
        paramInt = i + e.a.a.a.ix(3, this.wzc.computeSize());
      i = paramInt;
      if (this.vJS != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vJS);
      AppMethodBeat.o(48880);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wzb.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48880);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ave localave = (ave)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48880);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cgv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localave.wza = paramArrayOfObject;
          }
          AppMethodBeat.o(48880);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cgd();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localave.wzb.add(paramArrayOfObject);
          }
          AppMethodBeat.o(48880);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cgv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cgv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localave.wzc = ((cgv)localObject1);
          }
          AppMethodBeat.o(48880);
          paramInt = i;
          break;
        case 4:
          localave.vJS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48880);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48880);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ave
 * JD-Core Version:    0.6.2
 */