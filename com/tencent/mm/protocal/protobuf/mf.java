package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class mf extends com.tencent.mm.bt.a
{
  public String Desc;
  public String ThumbUrl;
  public String Title;
  public mi vPY;
  public mj vPZ;
  public mc vQa;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124292);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Title");
        AppMethodBeat.o(124292);
        throw paramArrayOfObject;
      }
      if (this.Desc == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Desc");
        AppMethodBeat.o(124292);
        throw paramArrayOfObject;
      }
      if (this.ThumbUrl == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ThumbUrl");
        AppMethodBeat.o(124292);
        throw paramArrayOfObject;
      }
      if (this.vPY == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: DetailInfo");
        AppMethodBeat.o(124292);
        throw paramArrayOfObject;
      }
      if (this.vQa == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ActionInfo");
        AppMethodBeat.o(124292);
        throw paramArrayOfObject;
      }
      if (this.Title != null)
        paramArrayOfObject.e(1, this.Title);
      if (this.Desc != null)
        paramArrayOfObject.e(2, this.Desc);
      if (this.ThumbUrl != null)
        paramArrayOfObject.e(3, this.ThumbUrl);
      if (this.vPY != null)
      {
        paramArrayOfObject.iy(4, this.vPY.computeSize());
        this.vPY.writeFields(paramArrayOfObject);
      }
      if (this.vPZ != null)
      {
        paramArrayOfObject.iy(5, this.vPZ.computeSize());
        this.vPZ.writeFields(paramArrayOfObject);
      }
      if (this.vQa != null)
      {
        paramArrayOfObject.iy(6, this.vQa.computeSize());
        this.vQa.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(124292);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Title == null)
        break label1073;
    label1073: for (i = e.a.a.b.b.a.f(1, this.Title) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.Desc != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.Desc);
      i = paramInt;
      if (this.ThumbUrl != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.ThumbUrl);
      paramInt = i;
      if (this.vPY != null)
        paramInt = i + e.a.a.a.ix(4, this.vPY.computeSize());
      i = paramInt;
      if (this.vPZ != null)
        i = paramInt + e.a.a.a.ix(5, this.vPZ.computeSize());
      paramInt = i;
      if (this.vQa != null)
        paramInt = i + e.a.a.a.ix(6, this.vQa.computeSize());
      AppMethodBeat.o(124292);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.Title == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Title");
          AppMethodBeat.o(124292);
          throw paramArrayOfObject;
        }
        if (this.Desc == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Desc");
          AppMethodBeat.o(124292);
          throw paramArrayOfObject;
        }
        if (this.ThumbUrl == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ThumbUrl");
          AppMethodBeat.o(124292);
          throw paramArrayOfObject;
        }
        if (this.vPY == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: DetailInfo");
          AppMethodBeat.o(124292);
          throw paramArrayOfObject;
        }
        if (this.vQa == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ActionInfo");
          AppMethodBeat.o(124292);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(124292);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        mf localmf = (mf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124292);
          break;
        case 1:
          localmf.Title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124292);
          paramInt = i;
          break;
        case 2:
          localmf.Desc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124292);
          paramInt = i;
          break;
        case 3:
          localmf.ThumbUrl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124292);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new mi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((mi)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localmf.vPY = ((mi)localObject1);
          }
          AppMethodBeat.o(124292);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new mj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((mj)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localmf.vPZ = ((mj)localObject1);
          }
          AppMethodBeat.o(124292);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new mc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((mc)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localmf.vQa = ((mc)localObject1);
          }
          AppMethodBeat.o(124292);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(124292);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.mf
 * JD-Core Version:    0.6.2
 */