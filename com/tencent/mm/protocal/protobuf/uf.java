package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class uf extends com.tencent.mm.bt.a
{
  public String Desc;
  public String Title;
  public String Url;
  public int wbJ;
  public LinkedList<bau> wbK;
  public int wbL;
  public String wbM;
  public azu wbN;

  public uf()
  {
    AppMethodBeat.i(94516);
    this.wbK = new LinkedList();
    AppMethodBeat.o(94516);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94517);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Desc != null)
        paramArrayOfObject.e(1, this.Desc);
      paramArrayOfObject.iz(2, this.wbJ);
      if (this.Title != null)
        paramArrayOfObject.e(3, this.Title);
      if (this.Url != null)
        paramArrayOfObject.e(4, this.Url);
      paramArrayOfObject.e(5, 8, this.wbK);
      paramArrayOfObject.iz(6, this.wbL);
      if (this.wbM != null)
        paramArrayOfObject.e(7, this.wbM);
      if (this.wbN != null)
      {
        paramArrayOfObject.iy(8, this.wbN.computeSize());
        this.wbN.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(94517);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Desc == null)
        break label821;
    label821: for (paramInt = e.a.a.b.b.a.f(1, this.Desc) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wbJ);
      paramInt = i;
      if (this.Title != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.Title);
      i = paramInt;
      if (this.Url != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.Url);
      i = i + e.a.a.a.c(5, 8, this.wbK) + e.a.a.b.b.a.bs(6, this.wbL);
      paramInt = i;
      if (this.wbM != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wbM);
      i = paramInt;
      if (this.wbN != null)
        i = paramInt + e.a.a.a.ix(8, this.wbN.computeSize());
      AppMethodBeat.o(94517);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wbK.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94517);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        uf localuf = (uf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94517);
          break;
        case 1:
          localuf.Desc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94517);
          paramInt = i;
          break;
        case 2:
          localuf.wbJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94517);
          paramInt = i;
          break;
        case 3:
          localuf.Title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94517);
          paramInt = i;
          break;
        case 4:
          localuf.Url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94517);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bau();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bau)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localuf.wbK.add(localObject1);
          }
          AppMethodBeat.o(94517);
          paramInt = i;
          break;
        case 6:
          localuf.wbL = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94517);
          paramInt = i;
          break;
        case 7:
          localuf.wbM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94517);
          paramInt = i;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new azu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localuf.wbN = paramArrayOfObject;
          }
          AppMethodBeat.o(94517);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94517);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.uf
 * JD-Core Version:    0.6.2
 */