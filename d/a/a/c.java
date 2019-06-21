package d.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class c extends com.tencent.mm.bt.a
{
  public int BTA;
  public int BTB;
  public int BTC;
  public e BTD;
  public String BTE;
  public b BTF;
  public String wdr;
  public String wev;
  public LinkedList<g> wew;
  public int wex;
  public a wey;

  public c()
  {
    AppMethodBeat.i(57007);
    this.wew = new LinkedList();
    AppMethodBeat.o(57007);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(57008);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.e(1, 8, this.wew);
      paramArrayOfObject.iz(2, this.BTA);
      if (this.wdr != null)
        paramArrayOfObject.e(3, this.wdr);
      paramArrayOfObject.iz(4, this.wex);
      if (this.wey != null)
      {
        paramArrayOfObject.iy(5, this.wey.computeSize());
        this.wey.writeFields(paramArrayOfObject);
      }
      if (this.wev != null)
        paramArrayOfObject.e(6, this.wev);
      paramArrayOfObject.iz(7, this.BTB);
      paramArrayOfObject.iz(8, this.BTC);
      if (this.BTD != null)
      {
        paramArrayOfObject.iy(9, this.BTD.computeSize());
        this.BTD.writeFields(paramArrayOfObject);
      }
      if (this.BTE != null)
        paramArrayOfObject.e(10, this.BTE);
      if (this.BTF != null)
      {
        paramArrayOfObject.iy(11, this.BTF.computeSize());
        this.BTF.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(57008);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.a.c(1, 8, this.wew) + 0 + e.a.a.b.b.a.bs(2, this.BTA);
        paramInt = i;
        if (this.wdr != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.wdr);
        i = paramInt + e.a.a.b.b.a.bs(4, this.wex);
        paramInt = i;
        if (this.wey != null)
          paramInt = i + e.a.a.a.ix(5, this.wey.computeSize());
        i = paramInt;
        if (this.wev != null)
          i = paramInt + e.a.a.b.b.a.f(6, this.wev);
        paramInt = i + e.a.a.b.b.a.bs(7, this.BTB) + e.a.a.b.b.a.bs(8, this.BTC);
        i = paramInt;
        if (this.BTD != null)
          i = paramInt + e.a.a.a.ix(9, this.BTD.computeSize());
        paramInt = i;
        if (this.BTE != null)
          paramInt = i + e.a.a.b.b.a.f(10, this.BTE);
        i = paramInt;
        if (this.BTF != null)
          i = paramInt + e.a.a.a.ix(11, this.BTF.computeSize());
        AppMethodBeat.o(57008);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wew.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(57008);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        c localc = (c)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(57008);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new g();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localc.wew.add(paramArrayOfObject);
          }
          AppMethodBeat.o(57008);
          paramInt = 0;
          break;
        case 2:
          localc.BTA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(57008);
          paramInt = 0;
          break;
        case 3:
          localc.wdr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(57008);
          paramInt = 0;
          break;
        case 4:
          localc.wex = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(57008);
          paramInt = 0;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new a();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((a)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localc.wey = ((a)localObject1);
          }
          AppMethodBeat.o(57008);
          paramInt = 0;
          break;
        case 6:
          localc.wev = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(57008);
          paramInt = 0;
          break;
        case 7:
          localc.BTB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(57008);
          paramInt = 0;
          break;
        case 8:
          localc.BTC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(57008);
          paramInt = 0;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new e();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((e)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localc.BTD = ((e)localObject1);
          }
          AppMethodBeat.o(57008);
          paramInt = 0;
          break;
        case 10:
          localc.BTE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(57008);
          paramInt = 0;
          break;
        case 11:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new b();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((b)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localc.BTF = ((b)localObject1);
          }
          AppMethodBeat.o(57008);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(57008);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     d.a.a.c
 * JD-Core Version:    0.6.2
 */