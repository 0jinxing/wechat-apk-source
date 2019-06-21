package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class db extends com.tencent.mm.bt.a
{
  public String nbs;
  public fq vFj;
  public LinkedList<ary> vFk;

  public db()
  {
    AppMethodBeat.i(94504);
    this.vFk = new LinkedList();
    AppMethodBeat.o(94504);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94505);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vFj == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ArtisAuthor");
        AppMethodBeat.o(94505);
        throw paramArrayOfObject;
      }
      if (this.vFj != null)
      {
        paramArrayOfObject.iy(1, this.vFj.computeSize());
        this.vFj.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 8, this.vFk);
      if (this.nbs != null)
        paramArrayOfObject.e(3, this.nbs);
      AppMethodBeat.o(94505);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vFj == null)
        break label583;
    label583: for (paramInt = e.a.a.a.ix(1, this.vFj.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 8, this.vFk);
      paramInt = i;
      if (this.nbs != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.nbs);
      AppMethodBeat.o(94505);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vFk.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vFj == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ArtisAuthor");
          AppMethodBeat.o(94505);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(94505);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        db localdb = (db)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94505);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new fq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fq)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localdb.vFj = ((fq)localObject1);
          }
          AppMethodBeat.o(94505);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ary();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ary)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localdb.vFk.add(localObject1);
          }
          AppMethodBeat.o(94505);
          paramInt = i;
          break;
        case 3:
          localdb.nbs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94505);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94505);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.db
 * JD-Core Version:    0.6.2
 */