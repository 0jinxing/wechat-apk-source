package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class avo extends bsr
{
  public String csB;
  public String cvO;
  public int scene;
  public String signature;
  public String url;
  public String wzf;
  public String wzg;
  public LinkedList<String> wzx;
  public String wzy;

  public avo()
  {
    AppMethodBeat.i(10203);
    this.wzx = new LinkedList();
    AppMethodBeat.o(10203);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10204);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.url != null)
        paramArrayOfObject.e(2, this.url);
      if (this.csB != null)
        paramArrayOfObject.e(3, this.csB);
      paramArrayOfObject.e(4, 1, this.wzx);
      if (this.cvO != null)
        paramArrayOfObject.e(5, this.cvO);
      if (this.wzf != null)
        paramArrayOfObject.e(6, this.wzf);
      if (this.signature != null)
        paramArrayOfObject.e(7, this.signature);
      if (this.wzg != null)
        paramArrayOfObject.e(8, this.wzg);
      paramArrayOfObject.iz(9, this.scene);
      if (this.wzy != null)
        paramArrayOfObject.e(10, this.wzy);
      AppMethodBeat.o(10204);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label902;
    label902: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.url != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.url);
      i = paramInt;
      if (this.csB != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.csB);
      i += e.a.a.a.c(4, 1, this.wzx);
      paramInt = i;
      if (this.cvO != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.cvO);
      i = paramInt;
      if (this.wzf != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wzf);
      paramInt = i;
      if (this.signature != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.signature);
      i = paramInt;
      if (this.wzg != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.wzg);
      i += e.a.a.b.b.a.bs(9, this.scene);
      paramInt = i;
      if (this.wzy != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.wzy);
      AppMethodBeat.o(10204);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wzx.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10204);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        avo localavo = (avo)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10204);
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
            localavo.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(10204);
          paramInt = i;
          break;
        case 2:
          localavo.url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10204);
          paramInt = i;
          break;
        case 3:
          localavo.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10204);
          paramInt = i;
          break;
        case 4:
          localavo.wzx.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(10204);
          paramInt = i;
          break;
        case 5:
          localavo.cvO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10204);
          paramInt = i;
          break;
        case 6:
          localavo.wzf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10204);
          paramInt = i;
          break;
        case 7:
          localavo.signature = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10204);
          paramInt = i;
          break;
        case 8:
          localavo.wzg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10204);
          paramInt = i;
          break;
        case 9:
          localavo.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(10204);
          paramInt = i;
          break;
        case 10:
          localavo.wzy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10204);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10204);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.avo
 * JD-Core Version:    0.6.2
 */