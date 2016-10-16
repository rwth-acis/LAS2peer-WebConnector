package i5.las2peer.webConnector.services;

import i5.las2peer.restMapper.RESTService;
import i5.las2peer.restMapper.annotations.ServicePath;
import i5.las2peer.webConnector.services.classLoaderTest.TestResource;

@ServicePath("classloader")
public class TestClassLoaderService extends RESTService {

	@Override
	protected void initResources() {
		getResourceConfig().packages(TestResource.class.getPackage().toString());
	}

}
