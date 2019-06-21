package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ah extends com.tencent.mm.bt.a
{
  public String mZL;
  public String mZM;
  public LinkedList<cx> naO;
  public String naP;
  public String naQ;

  public ah()
  {
    AppMethodBeat.i(111573);
    this.naO = new LinkedList();
    AppMethodBeat.o(111573);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111574);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZM != null)
        paramArrayOfObject.e(1, this.mZM);
      paramArrayOfObject.e(2, 8, this.naO);
      if (this.naP != null)
        paramArrayOfObject.e(3, this.naP);
      if (this.naQ != null)
        paramArrayOfObject.e(4, this.naQ);
      if (this.mZL != null)
        paramArrayOfObject.e(5, this.mZL);
      AppMethodBeat.o(111574);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZM == null)
        break label568;
    label568: for (paramInt = e.a.a.b.b.a.f(1, this.mZM) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.a.c(2, 8, this.naO);
      i = paramInt;
      if (this.naP != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.naP);
      paramInt = i;
      if (this.naQ != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.naQ);
      i = paramInt;
      if (this.mZL != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.mZL);
      AppMethodBeat.o(111574);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.naO.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111574);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ah localah = (ah)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111574);
          break;
        case 1:
          localah.mZM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111574);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((cx)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localah.naO.add(localObject1);
          }
          AppMethodBeat.o(111574);
          paramInt = i;
          break;
        case 3:
          localah.naP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111574);
          paramInt = i;
          break;
        case 4:
          localah.naQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111574);
          paramInt = i;
          break;
        case 5:
          localah.mZL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111574);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111574);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.ah
 * JD-Core Version:    0.6.2
 */