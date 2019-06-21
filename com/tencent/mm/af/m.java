package com.tencent.mm.af;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public class m extends com.tencent.mm.bt.a
{
  public String cMg;
  public String cMh;
  public String dJv;
  public LinkedList<p> fjr;
  public int fjs;
  public String name;
  public int type;

  public m()
  {
    AppMethodBeat.i(105477);
    this.fjr = new LinkedList();
    AppMethodBeat.o(105477);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(105478);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.type);
      if (this.name != null)
        paramArrayOfObject.e(2, this.name);
      if (this.cMg != null)
        paramArrayOfObject.e(3, this.cMg);
      if (this.cMh != null)
        paramArrayOfObject.e(4, this.cMh);
      if (this.dJv != null)
        paramArrayOfObject.e(5, this.dJv);
      paramArrayOfObject.e(6, 8, this.fjr);
      paramArrayOfObject.iz(7, this.fjs);
      AppMethodBeat.o(105478);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.type) + 0;
        i = paramInt;
        if (this.name != null)
          i = paramInt + e.a.a.b.b.a.f(2, this.name);
        paramInt = i;
        if (this.cMg != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.cMg);
        i = paramInt;
        if (this.cMh != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.cMh);
        paramInt = i;
        if (this.dJv != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.dJv);
        paramInt = paramInt + e.a.a.a.c(6, 8, this.fjr) + e.a.a.b.b.a.bs(7, this.fjs);
        AppMethodBeat.o(105478);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.fjr.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(105478);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        m localm = (m)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(105478);
          break;
        case 1:
          localm.type = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(105478);
          paramInt = 0;
          break;
        case 2:
          localm.name = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(105478);
          paramInt = 0;
          break;
        case 3:
          localm.cMg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(105478);
          paramInt = 0;
          break;
        case 4:
          localm.cMh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(105478);
          paramInt = 0;
          break;
        case 5:
          localm.dJv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(105478);
          paramInt = 0;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new p();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((p)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localm.fjr.add(localObject1);
          }
          AppMethodBeat.o(105478);
          paramInt = 0;
          break;
        case 7:
          localm.fjs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(105478);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(105478);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.af.m
 * JD-Core Version:    0.6.2
 */