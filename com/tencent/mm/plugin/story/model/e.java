package com.tencent.mm.plugin.story.model;

import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cdq;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.util.HashMap;
import java.util.Vector;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/StoryAsyncQueueMgr;", "", "path", "", "(Ljava/lang/String;)V", "downLoadingScenes", "Ljava/util/HashMap;", "", "downLoadingSize", "getDownLoadingSize", "()I", "postLocks", "Ljava/util/Vector;", "queue", "Lcom/tencent/mm/protocal/protobuf/StoryAsyncQueue;", "releactionUploadScene", "selfName", "uploadLocks", "addDelItem", "", "snsId", "", "addDownLoadingId", "", "mediaId", "sceneKey", "addPostId", "mLocalId", "addUploadId", "checkNotDel", "checkQueue", "checkQueueImp", "checkSendComment", "commentList", "Ljava/util/LinkedList;", "Lcom/tencent/mm/protocal/protobuf/StoryCommentToSend;", "fileToList", "getSceneHashCodeByUploadId", "uploadId", "getSelfName", "isDownloading", "isInSnsObj", "list", "Lcom/tencent/mm/protocal/protobuf/StoryCommentInfo;", "content", "createTime", "isPosting", "listToFile", "releationUploadScene", "uplocalid", "hashCode", "removeDelItem", "removeDelItemImp", "removeDownLoadingS", "removePostId", "removeReleationUploadScene", "uploadid", "removeUploadId", "setSelfName", "Companion", "plugin-story_release"})
public final class e
{
  private static final String FILE_NAME = "storyAsyncQueue.data";
  private static final String TAG = "MicroMsg.StoryAsyncQueueMgr";
  private static final int rSm = 21600;
  private static final String rSn = "_AD_TAG_";
  public static final e.a rSo;
  private String ecX;
  private final String path;
  private cdq rSh;
  private final Vector<Integer> rSi;
  private final HashMap<String, Integer> rSj;
  private final Vector<Integer> rSk;
  private final HashMap<Integer, Integer> rSl;

  static
  {
    AppMethodBeat.i(109021);
    rSo = new e.a((byte)0);
    TAG = "MicroMsg.StoryAsyncQueueMgr";
    FILE_NAME = "storyAsyncQueue.data";
    rSm = 21600;
    rSn = "_AD_TAG_";
    AppMethodBeat.o(109021);
  }

  public e(String paramString)
  {
    AppMethodBeat.i(109020);
    this.path = paramString;
    this.ecX = "";
    this.rSi = new Vector();
    this.rSj = new HashMap();
    this.rSk = new Vector();
    this.rSl = new HashMap();
    if (!cnh())
      this.rSh = new cdq();
    this.rSi.clear();
    this.rSj.clear();
    AppMethodBeat.o(109020);
  }

  private final boolean cnh()
  {
    try
    {
      AppMethodBeat.i(109018);
      Object localObject1 = com.tencent.mm.vfs.e.e(this.path, 0, -1);
      boolean bool;
      if (localObject1 == null)
      {
        AppMethodBeat.o(109018);
        bool = false;
      }
      while (true)
      {
        return bool;
        try
        {
          cdq localcdq = new com/tencent/mm/protocal/protobuf/cdq;
          localcdq.<init>();
          localObject1 = localcdq.parseFrom((byte[])localObject1);
          if (localObject1 != null)
            break label102;
          localObject1 = new a/v;
          ((v)localObject1).<init>("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryAsyncQueue");
          AppMethodBeat.o(109018);
          throw ((Throwable)localObject1);
        }
        catch (IOException localIOException)
        {
          ab.printErrStackTrace(TAG, (Throwable)localIOException, "", new Object[0]);
          com.tencent.mm.vfs.e.deleteFile(this.path);
          AppMethodBeat.o(109018);
          bool = false;
        }
        continue;
        label102: this.rSh = ((cdq)localIOException);
        bool = true;
        AppMethodBeat.o(109018);
      }
    }
    finally
    {
    }
  }

  public final boolean CT(int paramInt)
  {
    try
    {
      AppMethodBeat.i(109019);
      this.rSi.remove(Integer.valueOf(paramInt));
      AppMethodBeat.o(109019);
      return true;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.e
 * JD-Core Version:    0.6.2
 */