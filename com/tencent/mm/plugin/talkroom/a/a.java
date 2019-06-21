package com.tencent.mm.plugin.talkroom.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cgm;
import e.a.a.b;
import java.util.LinkedList;

public final class a extends com.tencent.mm.bt.a
{
  public LinkedList<cgm> cGh;
  public int sceneType;
  public String username;

  public a()
  {
    AppMethodBeat.i(25750);
    this.cGh = new LinkedList();
    AppMethodBeat.o(25750);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(25751);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.username == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: username");
        AppMethodBeat.o(25751);
        throw paramArrayOfObject;
      }
      if (this.username != null)
        paramArrayOfObject.e(1, this.username);
      paramArrayOfObject.e(2, 8, this.cGh);
      paramArrayOfObject.iz(3, this.sceneType);
      AppMethodBeat.o(25751);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.username == null)
        break label479;
    label479: for (paramInt = e.a.a.b.b.a.f(1, this.username) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.a.c(2, 8, this.cGh) + e.a.a.b.b.a.bs(3, this.sceneType);
      AppMethodBeat.o(25751);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.cGh.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.username == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: username");
          AppMethodBeat.o(25751);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(25751);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        a locala = (a)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(25751);
          break;
        case 1:
          locala.username = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(25751);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cgm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((cgm)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locala.cGh.add(localObject1);
          }
          AppMethodBeat.o(25751);
          paramInt = i;
          break;
        case 3:
          locala.sceneType = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(25751);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(25751);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.talkroom.a.a
 * JD-Core Version:    0.6.2
 */