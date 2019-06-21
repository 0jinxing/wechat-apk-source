package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bqj extends com.tencent.mm.bt.a
{
  public long bHi;
  public String csB;
  public String nickname;
  public String pia;
  public String username;
  public String wSE;
  public double wSF;
  public LinkedList<on> wSG;
  public String wSH;
  public LinkedList<btm> wSI;

  public bqj()
  {
    AppMethodBeat.i(134441);
    this.wSG = new LinkedList();
    this.wSI = new LinkedList();
    AppMethodBeat.o(134441);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(134442);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.csB != null)
        paramArrayOfObject.e(1, this.csB);
      if (this.username != null)
        paramArrayOfObject.e(2, this.username);
      if (this.nickname != null)
        paramArrayOfObject.e(3, this.nickname);
      if (this.pia != null)
        paramArrayOfObject.e(4, this.pia);
      paramArrayOfObject.ai(5, this.bHi);
      if (this.wSE != null)
        paramArrayOfObject.e(6, this.wSE);
      paramArrayOfObject.f(7, this.wSF);
      paramArrayOfObject.e(16, 8, this.wSG);
      if (this.wSH != null)
        paramArrayOfObject.e(17, this.wSH);
      paramArrayOfObject.e(19, 8, this.wSI);
      AppMethodBeat.o(134442);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.csB == null)
        break label974;
    label974: for (paramInt = e.a.a.b.b.a.f(1, this.csB) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.username != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.username);
      paramInt = i;
      if (this.nickname != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.nickname);
      i = paramInt;
      if (this.pia != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.pia);
      i += e.a.a.b.b.a.o(5, this.bHi);
      paramInt = i;
      if (this.wSE != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wSE);
      i = paramInt + (e.a.a.b.b.a.fv(7) + 8) + e.a.a.a.c(16, 8, this.wSG);
      paramInt = i;
      if (this.wSH != null)
        paramInt = i + e.a.a.b.b.a.f(17, this.wSH);
      paramInt += e.a.a.a.c(19, 8, this.wSI);
      AppMethodBeat.o(134442);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wSG.clear();
        this.wSI.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(134442);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bqj localbqj = (bqj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 8:
        case 9:
        case 10:
        case 11:
        case 12:
        case 13:
        case 14:
        case 15:
        case 18:
        default:
          paramInt = -1;
          AppMethodBeat.o(134442);
          break;
        case 1:
          localbqj.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(134442);
          paramInt = i;
          break;
        case 2:
          localbqj.username = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(134442);
          paramInt = i;
          break;
        case 3:
          localbqj.nickname = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(134442);
          paramInt = i;
          break;
        case 4:
          localbqj.pia = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(134442);
          paramInt = i;
          break;
        case 5:
          localbqj.bHi = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(134442);
          paramInt = i;
          break;
        case 6:
          localbqj.wSE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(134442);
          paramInt = i;
          break;
        case 7:
          localbqj.wSF = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(134442);
          paramInt = i;
          break;
        case 16:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new on();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((on)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbqj.wSG.add(localObject1);
          }
          AppMethodBeat.o(134442);
          paramInt = i;
          break;
        case 17:
          localbqj.wSH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(134442);
          paramInt = i;
          break;
        case 19:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new btm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbqj.wSI.add(paramArrayOfObject);
          }
          AppMethodBeat.o(134442);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(134442);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bqj
 * JD-Core Version:    0.6.2
 */