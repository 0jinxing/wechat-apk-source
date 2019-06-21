package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bjl extends com.tencent.mm.bt.a
{
  public String desc;
  public String kbV;
  public String name;
  public String title;
  public int ttd;
  public String tte;
  public String ttg;
  public String tzW;
  public bqo wMS;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48918);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.name != null)
        paramArrayOfObject.e(1, this.name);
      if (this.title != null)
        paramArrayOfObject.e(2, this.title);
      if (this.desc != null)
        paramArrayOfObject.e(3, this.desc);
      if (this.kbV != null)
        paramArrayOfObject.e(4, this.kbV);
      paramArrayOfObject.iz(5, this.ttd);
      if (this.tte != null)
        paramArrayOfObject.e(6, this.tte);
      if (this.tzW != null)
        paramArrayOfObject.e(7, this.tzW);
      if (this.ttg != null)
        paramArrayOfObject.e(8, this.ttg);
      if (this.wMS != null)
      {
        paramArrayOfObject.iy(9, this.wMS.computeSize());
        this.wMS.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(48918);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.name == null)
        break label824;
    label824: for (i = e.a.a.b.b.a.f(1, this.name) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.title != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.title);
      i = paramInt;
      if (this.desc != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.desc);
      paramInt = i;
      if (this.kbV != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.kbV);
      i = paramInt + e.a.a.b.b.a.bs(5, this.ttd);
      paramInt = i;
      if (this.tte != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.tte);
      i = paramInt;
      if (this.tzW != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.tzW);
      paramInt = i;
      if (this.ttg != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.ttg);
      i = paramInt;
      if (this.wMS != null)
        i = paramInt + e.a.a.a.ix(9, this.wMS.computeSize());
      AppMethodBeat.o(48918);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48918);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bjl localbjl = (bjl)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48918);
          break;
        case 1:
          localbjl.name = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48918);
          paramInt = i;
          break;
        case 2:
          localbjl.title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48918);
          paramInt = i;
          break;
        case 3:
          localbjl.desc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48918);
          paramInt = i;
          break;
        case 4:
          localbjl.kbV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48918);
          paramInt = i;
          break;
        case 5:
          localbjl.ttd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48918);
          paramInt = i;
          break;
        case 6:
          localbjl.tte = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48918);
          paramInt = i;
          break;
        case 7:
          localbjl.tzW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48918);
          paramInt = i;
          break;
        case 8:
          localbjl.ttg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48918);
          paramInt = i;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bqo();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bqo)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbjl.wMS = ((bqo)localObject1);
          }
          AppMethodBeat.o(48918);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48918);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bjl
 * JD-Core Version:    0.6.2
 */