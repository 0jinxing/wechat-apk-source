package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.hl;
import java.util.LinkedList;

public final class z extends bsr
{
  public String mZr;
  public String nat;
  public com.tencent.mm.bt.b nau;
  public com.tencent.mm.bt.b nav;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111564);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZr == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: AppID");
        AppMethodBeat.o(111564);
        throw paramArrayOfObject;
      }
      if (this.nat == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: GroupID");
        AppMethodBeat.o(111564);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.mZr != null)
        paramArrayOfObject.e(2, this.mZr);
      if (this.nat != null)
        paramArrayOfObject.e(3, this.nat);
      if (this.nau != null)
        paramArrayOfObject.c(4, this.nau);
      if (this.nav != null)
        paramArrayOfObject.c(5, this.nav);
      AppMethodBeat.o(111564);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label675;
    label675: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.mZr != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.mZr);
      i = paramInt;
      if (this.nat != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.nat);
      paramInt = i;
      if (this.nau != null)
        paramInt = i + e.a.a.b.b.a.b(4, this.nau);
      i = paramInt;
      if (this.nav != null)
        i = paramInt + e.a.a.b.b.a.b(5, this.nav);
      AppMethodBeat.o(111564);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.mZr == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: AppID");
          AppMethodBeat.o(111564);
          throw paramArrayOfObject;
        }
        if (this.nat == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: GroupID");
          AppMethodBeat.o(111564);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111564);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        z localz = (z)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111564);
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
            localz.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(111564);
          paramInt = i;
          break;
        case 2:
          localz.mZr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111564);
          paramInt = i;
          break;
        case 3:
          localz.nat = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111564);
          paramInt = i;
          break;
        case 4:
          localz.nau = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(111564);
          paramInt = i;
          break;
        case 5:
          localz.nav = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(111564);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111564);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.z
 * JD-Core Version:    0.6.2
 */