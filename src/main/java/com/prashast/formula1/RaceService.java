package com.prashast.formula1;

import ratpack.exec.Promise;
import ratpack.http.client.ReceivedResponse;

public interface RaceService {

    Promise<ReceivedResponse> getValue();
}
