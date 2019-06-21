package com.tencent.mm.plugin.report.kvdata;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public class WeChatSDInfo extends com.tencent.mm.bt.a
{
  public int depth_;
  public long dirCount_;
  public long fileCount_;
  public long fileLenInvalidCount_;
  public LinkedList<SubDirInfo> subDirList_;
  public int subDirResultsSize_;
  public long tempAccDirCount_;
  public int tempAccDirResultsSize_;
  public long tempAccFileCount_;
  public long tempAccFileLenInvalidCount_;
  public long tempAccTotalSize_;
  public long totalSize_;
  public long totalTime_;

  public WeChatSDInfo()
  {
    AppMethodBeat.i(79156);
    this.subDirList_ = new LinkedList();
    AppMethodBeat.o(79156);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(79157);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.totalSize_);
      paramArrayOfObject.ai(2, this.dirCount_);
      paramArrayOfObject.ai(3, this.fileCount_);
      paramArrayOfObject.ai(4, this.fileLenInvalidCount_);
      paramArrayOfObject.iz(5, this.subDirResultsSize_);
      paramArrayOfObject.ai(6, this.totalTime_);
      paramArrayOfObject.iz(7, this.depth_);
      paramArrayOfObject.ai(8, this.tempAccTotalSize_);
      paramArrayOfObject.iz(9, this.tempAccDirResultsSize_);
      paramArrayOfObject.ai(10, this.tempAccDirCount_);
      paramArrayOfObject.ai(11, this.tempAccFileCount_);
      paramArrayOfObject.ai(12, this.tempAccFileLenInvalidCount_);
      paramArrayOfObject.e(13, 8, this.subDirList_);
      AppMethodBeat.o(79157);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.o(1, this.totalSize_) + 0 + e.a.a.b.b.a.o(2, this.dirCount_) + e.a.a.b.b.a.o(3, this.fileCount_) + e.a.a.b.b.a.o(4, this.fileLenInvalidCount_) + e.a.a.b.b.a.bs(5, this.subDirResultsSize_) + e.a.a.b.b.a.o(6, this.totalTime_) + e.a.a.b.b.a.bs(7, this.depth_) + e.a.a.b.b.a.o(8, this.tempAccTotalSize_) + e.a.a.b.b.a.bs(9, this.tempAccDirResultsSize_) + e.a.a.b.b.a.o(10, this.tempAccDirCount_) + e.a.a.b.b.a.o(11, this.tempAccFileCount_) + e.a.a.b.b.a.o(12, this.tempAccFileLenInvalidCount_) + e.a.a.a.c(13, 8, this.subDirList_);
        AppMethodBeat.o(79157);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.subDirList_.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(79157);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        WeChatSDInfo localWeChatSDInfo = (WeChatSDInfo)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(79157);
          break;
        case 1:
          localWeChatSDInfo.totalSize_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79157);
          paramInt = 0;
          break;
        case 2:
          localWeChatSDInfo.dirCount_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79157);
          paramInt = 0;
          break;
        case 3:
          localWeChatSDInfo.fileCount_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79157);
          paramInt = 0;
          break;
        case 4:
          localWeChatSDInfo.fileLenInvalidCount_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79157);
          paramInt = 0;
          break;
        case 5:
          localWeChatSDInfo.subDirResultsSize_ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79157);
          paramInt = 0;
          break;
        case 6:
          localWeChatSDInfo.totalTime_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79157);
          paramInt = 0;
          break;
        case 7:
          localWeChatSDInfo.depth_ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79157);
          paramInt = 0;
          break;
        case 8:
          localWeChatSDInfo.tempAccTotalSize_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79157);
          paramInt = 0;
          break;
        case 9:
          localWeChatSDInfo.tempAccDirResultsSize_ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79157);
          paramInt = 0;
          break;
        case 10:
          localWeChatSDInfo.tempAccDirCount_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79157);
          paramInt = 0;
          break;
        case 11:
          localWeChatSDInfo.tempAccFileCount_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79157);
          paramInt = 0;
          break;
        case 12:
          localWeChatSDInfo.tempAccFileLenInvalidCount_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79157);
          paramInt = 0;
          break;
        case 13:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SubDirInfo();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localWeChatSDInfo.subDirList_.add(paramArrayOfObject);
          }
          AppMethodBeat.o(79157);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(79157);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.kvdata.WeChatSDInfo
 * JD-Core Version:    0.6.2
 */